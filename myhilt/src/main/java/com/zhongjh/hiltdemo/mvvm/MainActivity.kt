package com.zhongjh.hiltdemo.mvvm

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.zhongjh.hiltdemo.databinding.ActivityMainBinding
import com.zhongjh.hiltdemo.mvvm.hilt.ViewModel
import dagger.hilt.android.AndroidEntryPoint

/**
 * 这是演示一个 仿造 MVVM的例子
 */
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvName.append(viewModel.shopBanner.toString())
    }
}