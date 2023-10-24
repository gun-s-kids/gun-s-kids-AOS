package com.ehyundai.project.club.view.main

import android.os.Bundle
import com.ehyundai.project.club.R
import com.ehyundai.project.club.base.BaseActivity
import com.ehyundai.project.club.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override val TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.vpMain.adapter = ViewPager2Adapter(supportFragmentManager, lifecycle)
    }
}