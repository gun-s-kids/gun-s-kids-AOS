package com.ehyundai.project.club.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<B: ViewBinding, R: BaseViewModel>(val bindingFactory: (LayoutInflater) -> B) : AppCompatActivity() {

    private var _binding: B? = null // 데이터 바인딩
    val binding get() = _binding!!
    abstract val TAG : String // 액티비티 태그
    abstract val viewModel: R // 뷰모델

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG,"onCreate")
        _binding = bindingFactory(layoutInflater)
        setContentView(binding.root)

    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG,"onRestart")
    }


    override fun onStart() {
        super.onStart()
        Log.i(TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"onDestroy")
        _binding = null
    }
}