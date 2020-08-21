package org.itstep.liannoi.sampleandroid.presentation

import android.app.Application
import org.itstep.liannoi.sampleandroid.ServiceLocator
import org.itstep.liannoi.sampleandroid.application.common.interfaces.TasksRepository

class TodoApplication : Application() {

    val tasksRepository: TasksRepository
        get() = ServiceLocator.provideTasksRepository()
}
