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
        setFragment(3)
    }

    @SuppressLint("CommitTransaction")
    fun setFragment(type: Int) {
        val transaction = supportFragmentManager.beginTransaction()
        when(type){
            1 -> transaction.replace(R.id.fl, SignUpFragment()).commit()
            2 -> transaction.replace(R.id.fl, AuthMailFragment()).commit()
            else -> transaction.replace(R.id.fl, MailFragment()).commit()
        }
    }
}