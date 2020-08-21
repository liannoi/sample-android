package org.itstep.liannoi.sampleandroid.application.common.interfaces

import org.itstep.liannoi.sampleandroid.application.storage.tasks.commands.CreateCommand
import org.itstep.liannoi.sampleandroid.application.storage.tasks.commands.DeleteCommand
import org.itstep.liannoi.sampleandroid.application.storage.tasks.commands.UpdateCommand
import org.itstep.liannoi.sampleandroid.application.storage.tasks.queries.DetailQuery
import org.itstep.liannoi.sampleandroid.application.storage.tasks.queries.ListQuery

interface TasksRepository : Repository<CreateCommand, CreateCommand.Handler,
        ListQuery, ListQuery.Handler,
        DetailQuery, DetailQuery.Handler,
        UpdateCommand, UpdateCommand.Handler,
        DeleteCommand, DeleteCommand.Handler>, Disposable
