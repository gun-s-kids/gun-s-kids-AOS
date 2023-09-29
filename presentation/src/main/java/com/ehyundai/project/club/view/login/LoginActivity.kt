package com.ehyundai.project.club.view.login

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.ehyundai.project.club.R
import com.ehyundai.project.club.base.BaseActivity
import com.ehyundai.project.club.databinding.ActivityLoginBinding
import com.ehyundai.project.club.view.main.MainActivity
import dagger.hilt.android.AndroidEntryPoint

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
    private val viewModel: LoginViewModel by viewModels()
    override val TAG: String = "LoginActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.viewModel = viewModel
        initViewModelCallback()
        login()
    }

    private fun initViewModelCallback() {
        with(viewModel) {
            isIdEmpty.observe(this@LoginActivity, Observer {
                showIdEmptyError()
            })
            isPwEmpty.observe(this@LoginActivity, Observer {
                showPwEmptyError()
            })
            loginErrorMsg.observe(this@LoginActivity, Observer {
                showToast(getString(R.string.id_pw_not_correct_error_msg))
            })
            successLogin.observe(this@LoginActivity, Observer {
                enterMain()
            })
        }
    }

    private fun showIdEmptyError(){
        binding.etEmail.error = getString(R.string.id_empty_error_msg)
    }

    private fun showPwEmptyError(){
        binding.etPassword.error = getString(R.string.pw_empty_error_msg)
    }

    private fun enterMain(){
        showToast(getString(R.string.login_success_msg))
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

    private fun login(){
        binding.btnSignIn.setOnClickListener { viewModel.onLoginClick() }
    }
}