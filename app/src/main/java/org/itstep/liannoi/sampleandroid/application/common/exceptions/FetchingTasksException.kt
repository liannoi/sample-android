package org.itstep.liannoi.sampleandroid.application.common.exceptions

class FetchingTasksException constructor(
    message: String
) : Exception(message) {

    constructor() : this("An error occurred while trying to get tasks.")
}
