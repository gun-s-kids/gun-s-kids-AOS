package com.ehyundai.project.club.view.signUp

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ehyundai.project.club.R

class AuthMailFragment : Fragment() {

    companion object {
        fun newInstance() = AuthMailFragment()
    }

    private lateinit var viewModel: AuthMailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_auth_mail, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AuthMailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}