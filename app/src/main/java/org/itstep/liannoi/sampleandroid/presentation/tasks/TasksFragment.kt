package org.itstep.liannoi.sampleandroid.presentation.tasks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import org.itstep.liannoi.sampleandroid.databinding.FragmentTasksBinding
import org.itstep.liannoi.sampleandroid.presentation.common.extensions.getViewModelFactory

class TasksFragment : Fragment() {

    private val viewModel: TasksViewModel by viewModels { getViewModelFactory() }
    private lateinit var viewDataBinding: FragmentTasksBinding
    private lateinit var listAdapter: TasksAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = FragmentTasksBinding.inflate(inflater, container, false).apply {
            viewmodel = viewModel
        }

        return viewDataBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewDataBinding.lifecycleOwner = viewLifecycleOwner
        setupListAdapter()
    }

    ///////////////////////////////////////////////////////////////////////////
    // Helpers
    ///////////////////////////////////////////////////////////////////////////

    private fun setupListAdapter() {
        listAdapter = TasksAdapter(viewDataBinding.viewmodel ?: return)
        viewDataBinding.tasksList.adapter = listAdapter
    }
}
