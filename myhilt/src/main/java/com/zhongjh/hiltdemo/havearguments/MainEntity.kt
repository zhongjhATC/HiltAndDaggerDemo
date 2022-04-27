package com.zhongjh.hiltdemo.havearguments

import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

/**
 *
 * @author zhongjh
 * @date 2022/4/26
 */
class MainEntity @AssistedInject constructor(@Assisted("name") var name: String,@Assisted("area") var area: String)