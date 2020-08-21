package org.itstep.liannoi.sampleandroid.presentation.common.extensions

import androidx.fragment.app.Fragment
import org.itstep.liannoi.sampleandroid.application.common.interfaces.TasksRepository
import org.itstep.liannoi.sampleandroid.presentation.TodoApplication
import org.itstep.liannoi.sampleandroid.presentation.ViewModelFactory

fun Fragment.getViewModelFactory(): ViewModelFactory {
    val repository: TasksRepository =
        (requireContext().applicationContext as TodoApplication).tasksRepository

    return ViewModelFactory(repository, this)
}
