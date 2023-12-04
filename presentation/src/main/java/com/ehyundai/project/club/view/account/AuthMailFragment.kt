package com.ehyundai.project.club.view.account

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.broooapps.otpedittext2.OnCompleteListener
import com.ehyundai.project.club.R
import com.ehyundai.project.club.base.BaseFragment
import com.ehyundai.project.club.databinding.FragmentAuthMailBinding


class AuthMailFragment : BaseFragment<FragmentAuthMailBinding>(R.layout.fragment_auth_mail) {
    private var signUpActivity: SignUpActivity? = null
    private var findAccountActivity: FindAccountActivity? = null
    private val viewModel: SignUpViewModel by activityViewModels()
    override val TAG: String = "AuthMailFragment"

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
        goSignUp()
        completeCode()
    }

    override fun onDetach() {
        super.onDetach()
        signUpActivity = null
        findAccountActivity = null
    }

    private fun goSignUp() {
        binding.btnSignUp.setOnClickListener {
            if (signUpActivity != null) {
                signUpActivity?.setFragment(1)
                viewModel.setTitle(3)
            } else if (findAccountActivity != null) {
                findAccountActivity?.setFragment(1)
                viewModel.setTitle(4)
            }
        }
    }

    private fun completeCode() {
        binding.etCode.setOnCompleteListener(OnCompleteListener { value ->
            if (signUpActivity != null) Toast.makeText(signUpActivity, "Completed $value", Toast.LENGTH_LONG).show()
            else if (findAccountActivity != null) Toast.makeText(findAccountActivity, "Completed $value", Toast.LENGTH_LONG).show() }
        )
    }
}