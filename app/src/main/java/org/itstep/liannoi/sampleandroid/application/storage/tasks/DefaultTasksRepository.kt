package org.itstep.liannoi.sampleandroid.application.storage.tasks

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import org.itstep.liannoi.sampleandroid.application.common.exceptions.FetchingTasksException
import org.itstep.liannoi.sampleandroid.application.common.interfaces.LocalDataSource
import org.itstep.liannoi.sampleandroid.application.common.interfaces.TasksRepository
import org.itstep.liannoi.sampleandroid.application.storage.tasks.commands.CreateCommand
import org.itstep.liannoi.sampleandroid.application.storage.tasks.commands.DeleteCommand
import org.itstep.liannoi.sampleandroid.application.storage.tasks.commands.UpdateCommand
import org.itstep.liannoi.sampleandroid.application.storage.tasks.models.Task
import org.itstep.liannoi.sampleandroid.application.storage.tasks.queries.DetailQuery
import org.itstep.liannoi.sampleandroid.application.storage.tasks.queries.ListQuery
import org.itstep.liannoi.sampleandroid.application.storage.tasks.sources.TasksRemoteDataSource

class DefaultTasksRepository constructor(
    private val tasksRemoteDataSource: TasksRemoteDataSource,
    private val tasksLocalDataSource: LocalDataSource<Task, Int>
) : TasksRepository {

    private val disposable: CompositeDisposable = CompositeDisposable()

    override fun create(request: CreateCommand, handler: CreateCommand.Handler) {
        /* no-op */
    }

    override fun getAll(request: ListQuery, handler: ListQuery.Handler) {
        tasksRemoteDataSource.getAll()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { handler.onTasksFetchedSuccess(it) },
                { handler.onTasksFetchedError(FetchingTasksException(it.message.toString())) }
            ).follow()
    }

    override fun getById(request: DetailQuery, handler: DetailQuery.Handler) {
        /* no-op */
    }

    override fun update(request: UpdateCommand, handler: UpdateCommand.Handler) {
        /* no-op */
    }

    override fun delete(request: DeleteCommand, handler: DeleteCommand.Handler) {
        /* no-op */
    }

    ///////////////////////////////////////////////////////////////////////////
    // Dispose
    ///////////////////////////////////////////////////////////////////////////

    override fun stop() {
        disposable.clear()
    }

    override fun destroy() {
        disposable.dispose()
    }

    private fun Disposable.follow() {
        disposable.add(this)
    }
}
