package org.itstep.liannoi.sampleandroid.application.storage.tasks.queries

import org.itstep.liannoi.sampleandroid.application.storage.tasks.models.Task

class ListQuery {

    interface Handler {

        fun onTasksFetchedSuccess(tasks: List<Task>)

        fun onTasksFetchedError(exception: String)
    }
}
