package com.example.projectmaster.ui_fragments.priority_calculator

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.projectmaster.R

class PMProjectCalculator : Fragment() {

    companion object {
        fun newInstance() = PMProjectCalculator()
    }

    private lateinit var viewModel: PMProjectCalculatorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.p_m_project_calculator_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PMProjectCalculatorViewModel::class.java)
        // TODO: Use the ViewModel
    }

}