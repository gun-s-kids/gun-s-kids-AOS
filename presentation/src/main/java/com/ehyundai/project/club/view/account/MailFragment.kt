package com.ehyundai.project.club.view.account

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.activityViewModels
import com.ehyundai.project.club.R
import com.ehyundai.project.club.base.BaseFragment
import com.ehyundai.project.club.databinding.FragmentMailBinding

class MailFragment : BaseFragment<FragmentMailBinding>(R.layout.fragment_mail) {
    private var signUpActivity: SignUpActivity? = null
    private var findAccountActivity: FindAccountActivity? = null
    private val viewModel: SignUpViewModel by activityViewModels()
    override val TAG: String = "MailFragment"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is SignUpActivity)
            signUpActivity = context
        else if (context is FindAccountActivity)
            findAccountActivity = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
        goAuthMail()
        activity
    }

    override fun onDetach() {
        super.onDetach()
        signUpActivity = null
        findAccountActivity = null
    }

    private fun goAuthMail() {
        binding.btnSignUp.setOnClickListener {
            if (signUpActivity != null) signUpActivity?.setFragment(2)
            else if (findAccountActivity != null) findAccountActivity?.setFragment(2)
        }
    }
}
