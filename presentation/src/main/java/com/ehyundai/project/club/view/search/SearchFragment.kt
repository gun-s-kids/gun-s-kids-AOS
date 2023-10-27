package com.ehyundai.project.club.view.search

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.ehyundai.project.club.R
import com.ehyundai.project.club.base.BaseFragment
import com.ehyundai.project.club.databinding.FragmentSearchBinding
import com.ehyundai.project.club.view.main.MainActivity

class SearchFragment : BaseFragment<FragmentSearchBinding>(R.layout.fragment_search) {
    private var parentActivity: MainActivity? = null
    private val viewModel: SearchViewModel by viewModels()
    override val TAG: String = "SearchFragment"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        parentActivity = activity as MainActivity
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
    }

    override fun onDetach() {
        super.onDetach()
        parentActivity = null
    }
}