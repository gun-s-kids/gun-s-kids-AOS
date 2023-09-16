package com.ehyundai.project.club.view

import android.os.Bundle
import com.ehyundai.project.club.R
import com.ehyundai.project.club.base.BaseActivity
import com.ehyundai.project.club.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>({ ActivityMainBinding.inflate(it)}) {
    override val TAG : String = "MainActivity"
    override val viewModel: MainViewModel
        get() {
            TODO()
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}