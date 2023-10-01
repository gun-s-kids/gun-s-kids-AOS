package com.ehyundai.project.club.view.signUp

import androidx.fragment.app.viewModels
import com.ehyundai.project.club.R
import com.ehyundai.project.club.base.BaseFragment
import com.ehyundai.project.club.databinding.FragmentSignUpBinding

class SignUpFragment : BaseFragment<FragmentSignUpBinding>(R.layout.fragment_sign_up) {
    private val viewModel: SignUpViewModel by viewModels()
    override val TAG: String = "SignUpFragment"

}