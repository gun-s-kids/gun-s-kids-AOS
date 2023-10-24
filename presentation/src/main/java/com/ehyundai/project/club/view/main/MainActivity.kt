package com.ehyundai.project.club.view.main

import android.os.Bundle
import com.ehyundai.project.club.R
import com.ehyundai.project.club.base.BaseActivity
import com.ehyundai.project.club.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override val TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.vpMain.adapter = ViewPager2Adapter(supportFragmentManager, lifecycle)
        drawTabLayout()
    }

    private fun drawTabLayout(){
        // connect ViewPager2
        TabLayoutMediator(binding.tlMain, binding.vpMain) { _, _ -> }.attach()

        // set tabIcon
        binding.tlMain.getTabAt(0)!!.setIcon(R.drawable.ic_search_rank_down)
        binding.tlMain.getTabAt(1)!!.setIcon(R.drawable.ic_search_no_change)
        binding.tlMain.getTabAt(2)!!.setIcon(R.drawable.ic_search_rank_up)
    }
}