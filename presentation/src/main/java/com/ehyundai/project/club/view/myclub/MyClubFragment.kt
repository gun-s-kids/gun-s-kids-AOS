package com.ehyundai.project.club.view.myclub

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.activityViewModels
import com.ehyundai.project.club.R
import com.ehyundai.project.club.base.BaseFragment
import com.ehyundai.project.club.databinding.FragmentMyClubBinding
import com.ehyundai.project.club.view.main.MainActivity

class MyClubFragment : BaseFragment<FragmentMyClubBinding>(R.layout.fragment_my_club) {
    private var parentActivity: MainActivity? = null
    private val viewModel: MyClubViewModel by activityViewModels()
    override val TAG: String = "MyClubFragment"

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