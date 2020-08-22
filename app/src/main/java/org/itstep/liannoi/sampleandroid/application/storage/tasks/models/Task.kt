package org.itstep.liannoi.sampleandroid.application.storage.tasks.models

import com.google.gson.annotations.SerializedName
import java.util.*

data class Task constructor(
    @SerializedName("userId") val userId: Int = 0,
    @SerializedName("id") val id: Int = 0,
    @SerializedName("title") val title: String = "",
    @SerializedName("completed") val completed: Boolean = false
) {

    val titleForList: String
        get() = title.capitalize(Locale.ROOT)

    val userIdForList: String
        get() = "User ID: $userId"
}
