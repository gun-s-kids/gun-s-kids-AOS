package com.ehyundai.project.club.view.signUp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.viewModels
import com.ehyundai.project.club.R
import com.ehyundai.project.club.base.BaseActivity
import com.ehyundai.project.club.databinding.ActivitySignUpBinding

class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
    private val viewModel: SignUpViewModel by viewModels()
    override val TAG: String = "SignUpActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.viewModel = viewModel

        setSignUp()
    }

    @SuppressLint("CommitTransaction")
    private fun setSignUp() {
        val transaction = supportFragmentManager.beginTransaction().add(R.id.fl, SignUpFragment())
        transaction.commit()
    }

    @SuppressLint("CommitTransaction")
    private fun setAuthMail() {
        val transaction = supportFragmentManager.beginTransaction().add(R.id.fl, AuthMailFragment())
        transaction.commit()
    }
}