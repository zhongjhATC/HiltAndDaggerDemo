package com.zhongjh.hiltdemo.noarguments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zhongjh.hiltdemo.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * 这是演示一个 没有参数 的构造函数
 */
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainEntity: MainEntity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainEntity.name = "名称"
        binding.tvName.append(mainEntity.name)
    }

}