package com.ehyundai.project.club.view.login

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.viewModels
import com.ehyundai.project.club.R
import com.ehyundai.project.club.base.BaseActivity
import com.ehyundai.project.club.databinding.ActivityFindAccountBinding
import com.ehyundai.project.club.view.signUp.AuthMailFragment
import com.ehyundai.project.club.view.signUp.MailFragment
import com.ehyundai.project.club.view.signUp.SignUpFragment
import com.ehyundai.project.club.view.signUp.SignUpViewModel

class FindAccountActivity : BaseActivity<ActivityFindAccountBinding>(R.layout.activity_find_account) {
    private val viewModel: SignUpViewModel by viewModels()
    override val TAG: String = "FindAccountActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.viewModel = viewModel
        viewModel.setTitle(false)
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