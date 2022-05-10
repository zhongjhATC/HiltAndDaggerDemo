package com.zhongjh.hiltdemo.mvvm.hilt

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 *
 * @author zhongjh
 * @date 2022/5/10
 */
@HiltViewModel
class ViewModel @Inject constructor(
    testApi: TestApi
) : ViewModel() {

    val shopBanner = testApi.getValue()
}