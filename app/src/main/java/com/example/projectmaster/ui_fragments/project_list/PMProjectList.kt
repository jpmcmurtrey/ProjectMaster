package com.example.projectmaster.ui_fragments.project_list

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.projectmaster.R

class PMProjectList : Fragment() {

    companion object {
        fun newInstance() = PMProjectList()
    }

    private lateinit var viewModel: PMProjectListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.p_m_project_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PMProjectListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}