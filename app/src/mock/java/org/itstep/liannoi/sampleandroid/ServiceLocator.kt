package org.itstep.liannoi.sampleandroid

import org.itstep.liannoi.sampleandroid.application.ApplicationDefaults
import org.itstep.liannoi.sampleandroid.application.common.interfaces.TasksRepository
import org.itstep.liannoi.sampleandroid.application.storage.tasks.DefaultTasksRepository
import org.itstep.liannoi.sampleandroid.application.storage.tasks.sources.TasksRemoteDataSource
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object ServiceLocator {

    @Volatile
    var tasksRepository: TasksRepository? = null

    fun provideTasksRepository(): TasksRepository {
        synchronized(this) {
            return tasksRepository ?: tasksRepository ?: createTasksRepository()
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    // Helpers
    ///////////////////////////////////////////////////////////////////////////

    private fun createTasksRepository(): TasksRepository {
        val repository = DefaultTasksRepository(
            Retrofit.Builder()
                .baseUrl(ApplicationDefaults.ENDPOINT_BASE)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(TasksRemoteDataSource::class.java)
        )

        tasksRepository = repository

        return repository
    }
}
