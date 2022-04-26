package com.zhongjh.hiltdemo.noarguments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zhongjh.hiltdemo.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @set:Inject
    lateinit var mainEntity: MainEntity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        mainEntity.name = "名称"

//        tvName.append(mainEntity.name)
    }

}