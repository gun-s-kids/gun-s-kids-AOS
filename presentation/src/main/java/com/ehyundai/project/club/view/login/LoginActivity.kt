package com.ehyundai.project.club.view.login

import android.os.Bundle
import com.ehyundai.project.club.R
import com.ehyundai.project.club.base.BaseActivity
import com.ehyundai.project.club.databinding.ActivityLoginBinding
import dagger.hilt.android.AndroidEntryPoint

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
    override val TAG: String = "LoginActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}