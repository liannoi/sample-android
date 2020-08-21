package org.itstep.liannoi.sampleandroid.application.common.interfaces

/**
 * This interface is a marker interface. It is required to provide an abstraction for accessing
 * local data storage. Since this example doesn't use local data storage (SQLite), the abstraction
 * doesn't provide methods (functions in Kotlin), including for CRUD operations.
 */
interface LocalDataSource<TEntity, TKey>
