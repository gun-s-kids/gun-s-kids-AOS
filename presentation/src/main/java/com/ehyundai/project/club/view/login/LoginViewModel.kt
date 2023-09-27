package com.ehyundai.project.club.view.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ehyundai.project.club.base.BaseViewModel

class LoginViewModel : BaseViewModel() {

    private val _id = MutableLiveData<String>()
    val id: LiveData<String> = _id

    private val _pw = MutableLiveData<String>()
    val pw: LiveData<String> = _pw

    companion object { //이 아이디와 비번으로만 로그인이 가능 (서버X)
        private const val USER_ID = "id"
        private const val USER_PW = "pass"
    }
}