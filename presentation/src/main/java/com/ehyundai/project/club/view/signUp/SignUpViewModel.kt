package com.ehyundai.project.club.view.signUp

import androidx.lifecycle.MutableLiveData
import com.ehyundai.project.club.base.BaseViewModel

class SignUpViewModel : BaseViewModel() {
    val mail: MutableLiveData<String> = MutableLiveData("")

}