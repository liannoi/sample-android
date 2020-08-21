package org.itstep.liannoi.sampleandroid.presentation.tasks

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.itstep.liannoi.sampleandroid.application.storage.tasks.models.Task
import org.itstep.liannoi.sampleandroid.databinding.ItemTaskBinding

class TasksAdapter constructor(
    private val viewModel: TasksViewModel
) : ListAdapter<Task, TasksAdapter.ViewHolder>(TaskDiffCallback()) {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(viewModel, getItem(position))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder.from(parent)

    class ViewHolder private constructor(
        private val binding: ItemTaskBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(viewModel: TasksViewModel, task: Task) {
            binding.viewmodel = viewModel
            binding.task = task
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder = ViewHolder(
                ItemTaskBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            )
        }
    }

    class TaskDiffCallback : DiffUtil.ItemCallback<Task>() {

        override fun areItemsTheSame(oldItem: Task, newItem: Task): Boolean =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: Task, newItem: Task): Boolean = oldItem == newItem
    }
}
