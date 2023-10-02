package com.ehyundai.project.club.view.signUp

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.activityViewModels
import com.ehyundai.project.club.R
import com.ehyundai.project.club.base.BaseFragment
import com.ehyundai.project.club.databinding.FragmentMailBinding

class MailFragment : BaseFragment<FragmentMailBinding>(R.layout.fragment_mail) {
    private var parentActivity: SignUpActivity? = null
    private val viewModel: SignUpViewModel by activityViewModels()
    override val TAG: String = "MailFragment"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        parentActivity = activity as SignUpActivity
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        goAuthMail()
    }

    override fun onDetach() {
        super.onDetach()
        parentActivity = null
    }

    private fun goAuthMail(){
        binding.btnSignUp.setOnClickListener {
            if(parentActivity != null) parentActivity?.setFragment(2) }
    }
}
