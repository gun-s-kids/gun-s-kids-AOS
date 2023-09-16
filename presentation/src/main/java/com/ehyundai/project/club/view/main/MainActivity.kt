package com.ehyundai.project.club.view.main

import android.content.Intent
import android.os.Bundle
import com.ehyundai.project.club.base.BaseActivity
import com.ehyundai.project.club.databinding.ActivityMainBinding
import com.ehyundai.project.club.view.login.LoginActivity

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>({ ActivityMainBinding.inflate(it)}) {
    override val TAG : String = "MainActivity"
    override val viewModel: MainViewModel
        get() {
            TODO()
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btnTest.setOnClickListener {
            val nextIntent = Intent(this, LoginActivity::class.java)
            startActivity(nextIntent)
        }
    }


}