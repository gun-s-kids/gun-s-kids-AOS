package com.ehyundai.project.club.view.account

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.viewModels
import com.ehyundai.project.club.R
import com.ehyundai.project.club.base.BaseActivity
import com.ehyundai.project.club.databinding.ActivityFindAccountBinding
import com.ehyundai.project.club.view.account.PasswordFragment
import com.ehyundai.project.club.view.account.SignUpViewModel

class FindAccountActivity : BaseActivity<ActivityFindAccountBinding>(R.layout.activity_find_account) {
    private val viewModel: SignUpViewModel by viewModels()
    override val TAG: String = "FindAccountActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.viewModel = viewModel
        viewModel.setTitle(2)
        setFragment(3)
    }

    @SuppressLint("CommitTransaction")
    fun setFragment(type: Int) {
        val transaction = supportFragmentManager.beginTransaction()
        when(type){
            1 -> transaction.replace(R.id.fl, PasswordFragment()).commit()
            2 -> transaction.replace(R.id.fl, AuthMailFragment()).commit()
            else -> transaction.replace(R.id.fl, MailFragment()).commit()
        }
    }
}