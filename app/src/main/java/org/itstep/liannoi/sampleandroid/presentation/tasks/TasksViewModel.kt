package org.itstep.liannoi.sampleandroid.presentation.tasks

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.itstep.liannoi.sampleandroid.application.common.exceptions.FetchingTasksException
import org.itstep.liannoi.sampleandroid.application.common.interfaces.TasksRepository
import org.itstep.liannoi.sampleandroid.application.storage.tasks.models.Task
import org.itstep.liannoi.sampleandroid.application.storage.tasks.queries.ListQuery

class TasksViewModel constructor(
    private val tasksRepository: TasksRepository
) : ViewModel(),
    ListQuery.Handler {

    private val _items: MutableLiveData<List<Task>> = MutableLiveData()
    val items: LiveData<List<Task>> = _items

    init {
        loadTasks()
    }

    override fun onTasksFetchedSuccess(tasks: List<Task>) {
        _items.value = tasks
    }

    override fun onTasksFetchedError(exception: FetchingTasksException) {
        /* no-op */
    }

    ///////////////////////////////////////////////////////////////////////////
    // Helpers
    ///////////////////////////////////////////////////////////////////////////

    private fun loadTasks() {
        tasksRepository.getAll(ListQuery(), this)
    }

    ///////////////////////////////////////////////////////////////////////////
    // Disposable
    ///////////////////////////////////////////////////////////////////////////

    override fun onCleared() {
        super.onCleared()
        tasksRepository.stop()
        tasksRepository.destroy()
    }
}
