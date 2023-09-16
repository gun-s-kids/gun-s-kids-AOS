package com.ehyundai.project.club.view.login

import android.os.Bundle
import com.ehyundai.project.club.base.BaseActivity
import com.ehyundai.project.club.databinding.ActivityLoginBinding

class LoginActivity : BaseActivity<ActivityLoginBinding, LoginViewModel>({ ActivityLoginBinding.inflate(it)}) {
    override val TAG : String = "LoginActivity"
    override val viewModel: LoginViewModel
        get() {
            TODO()
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}