package com.zhongjh.hiltdemo.havearguments

import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory

/**
 *
 * @author zhongjh
 * @date 2022/4/27
 */
@AssistedFactory
interface MainFactory {
    fun create(@Assisted("name") name: String, @Assisted("area") area: String): MainEntity
}