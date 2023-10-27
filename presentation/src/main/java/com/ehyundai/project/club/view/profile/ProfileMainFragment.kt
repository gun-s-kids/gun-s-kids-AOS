package com.ehyundai.project.club.view.profile

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.ehyundai.project.club.R
import com.ehyundai.project.club.base.BaseFragment
import com.ehyundai.project.club.databinding.FragmentProfileMainBinding
import com.ehyundai.project.club.view.main.MainActivity

class ProfileMainFragment : BaseFragment<FragmentProfileMainBinding>(R.layout.fragment_profile_main) {
    private var parentActivity: MainActivity? = null
    private val viewModel: ProfileViewModel by viewModels()
    override val TAG: String = "ProfileMainFragment"

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