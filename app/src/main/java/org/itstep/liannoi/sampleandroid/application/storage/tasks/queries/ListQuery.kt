package org.itstep.liannoi.sampleandroid.application.storage.tasks.queries

import org.itstep.liannoi.sampleandroid.application.storage.tasks.models.Task

class ListQuery {

    interface Handler {

        fun onTasksFetchedSuccess(tasks: List<Task>)

        // TODO: 22.08.2020 Inject own business logic exception.
        fun onTasksFetchedError(exception: String)
    }
}
