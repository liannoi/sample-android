package org.itstep.liannoi.sampleandroid.presentation.common.extensions

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import org.itstep.liannoi.sampleandroid.application.storage.tasks.models.Task
import org.itstep.liannoi.sampleandroid.presentation.tasks.TasksAdapter

@BindingAdapter("app:items")
fun RecyclerView.adapt(items: List<Task>?) {
    items?.let { (adapter as TasksAdapter).submitList(items) }
}
