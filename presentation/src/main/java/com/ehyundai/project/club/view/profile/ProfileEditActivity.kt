package com.ehyundai.project.club.view.profile

import android.os.Bundle
import androidx.activity.viewModels
import com.ehyundai.project.club.R
import com.ehyundai.project.club.base.BaseActivity
import com.ehyundai.project.club.databinding.ActivityProfileEditBinding

class ProfileEditActivity : BaseActivity<ActivityProfileEditBinding>(R.layout.activity_profile_edit) {
    private val viewModel: ProfileViewModel by viewModels()
    override val TAG: String = "FindAccountActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.viewModel = viewModel
    }
}