package com.zhongjh.hiltdemo.mvvm.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * 这里才是正常实例化出Api地方，Hilt会根据标记类来自动寻找实例化
 * @author zhongjh
 * @date 2022/5/10
 */
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun GetApi(): TestApi {
        return TestApi()
    }

}