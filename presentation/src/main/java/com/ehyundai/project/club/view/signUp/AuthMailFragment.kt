package com.ehyundai.project.club.view.signUp

import androidx.fragment.app.viewModels
import com.ehyundai.project.club.R
import com.ehyundai.project.club.base.BaseFragment
import com.ehyundai.project.club.databinding.FragmentAuthMailBinding

class AuthMailFragment : BaseFragment<FragmentAuthMailBinding>(R.layout.fragment_auth_mail) {
    private val viewModel: AuthMailViewModel by viewModels()
    override val TAG: String = "AuthMailFragment"

}