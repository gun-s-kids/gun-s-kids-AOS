package com.ehyundai.project.club.view.signUp

import androidx.fragment.app.activityViewModels
import com.ehyundai.project.club.R
import com.ehyundai.project.club.base.BaseFragment
import com.ehyundai.project.club.databinding.FragmentMailBinding

class MailFragment : BaseFragment<FragmentMailBinding>(R.layout.fragment_mail) {
    private val viewModel: SignUpViewModel by activityViewModels()
    override val TAG: String = "MailFragment"

}
