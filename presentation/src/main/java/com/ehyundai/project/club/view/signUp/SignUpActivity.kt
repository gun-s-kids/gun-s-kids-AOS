package com.ehyundai.project.club.view.signUp

import android.os.Bundle
import com.ehyundai.project.club.base.BaseActivity

import com.ehyundai.project.club.databinding.ActivitySignUpBinding

class SignUpActivity : BaseActivity<ActivitySignUpBinding, SignUpViewModel>({ ActivitySignUpBinding.inflate(it)}) {
    override val TAG : String = "SignUpActivity"
    override val viewModel: SignUpViewModel
        get() {
            TODO()
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}