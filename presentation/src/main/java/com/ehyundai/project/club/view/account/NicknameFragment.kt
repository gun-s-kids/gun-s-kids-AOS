package com.ehyundai.project.club.view.account

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.activityViewModels
import com.ehyundai.project.club.R
import com.ehyundai.project.club.base.BaseFragment
import com.ehyundai.project.club.databinding.FragmentNicknameBinding

class NicknameFragment : BaseFragment<FragmentNicknameBinding>(R.layout.fragment_nickname) {
    private var parentActivity: Activity? = null
    private val viewModel: SignUpViewModel by activityViewModels()
    override val TAG: String = "NicknameFragment"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        parentActivity = activity
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
        finishSignUp()
    }

    override fun onDetach() {
        super.onDetach()
        parentActivity = null
    }

    private fun finishSignUp(){
        binding.btnSignUp.setOnClickListener {
            if(parentActivity != null) parentActivity?.finish() }
    }
}