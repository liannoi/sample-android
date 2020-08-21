package org.itstep.liannoi.sampleandroid.application.storage.tasks.sources

import io.reactivex.Observable
import org.itstep.liannoi.sampleandroid.application.ApplicationDefaults
import org.itstep.liannoi.sampleandroid.application.storage.tasks.models.Task
import retrofit2.http.GET

/**
 * This interface doesn't need to be implemented in the form of any class for it, the Proxy class
 * will be created by Retrofit itself at runtime. It is implemented according to the conventions of
 * the library through which we go to a remote data source.
 */
interface TasksRemoteDataSource {

    @GET(ApplicationDefaults.ENDPOINT_TASKS)
    fun getAll(): Observable<List<Task>>
}
