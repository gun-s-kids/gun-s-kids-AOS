package com.ehyundai.project.club.view.signUp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ehyundai.project.club.base.BaseViewModel
import javax.inject.Inject

class SignUpViewModel @Inject constructor() : BaseViewModel()  {
    val mail: MutableLiveData<String> = MutableLiveData("")

    val title = MutableLiveData<String>()


    fun setTitle(flag : Int){
        when (flag){
            1 -> title.value = "메일인증"
            2 -> title.value = "비밀번호 찾기"
            3 -> title.value = "회원가입"
            4 -> title.value = "비밀번호 재설정"
        }
    }

}