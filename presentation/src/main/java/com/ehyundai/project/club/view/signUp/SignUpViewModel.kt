package com.ehyundai.project.club.view.signUp

import androidx.lifecycle.MutableLiveData
import com.ehyundai.project.club.base.BaseViewModel
import javax.inject.Inject

class SignUpViewModel @Inject constructor() : BaseViewModel()  {
    val mail: MutableLiveData<String> = MutableLiveData("")

}