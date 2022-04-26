package com.zhongjh.mydagger2.module;

import dagger.Component;

/**
 * @author zhongjh
 * @date 2022/4/24
 */
@Component(modules = {MainModule.class})
public interface MainComponent {
    /**
     * 该方法名随意起，不管起什么，起多少个，最终生成的代码都是参数跟注入的MainModel结合
     * 当然，只能放置一个参数，如果加入多个参数会运行编译报错
     */
    void inject(MainActivity activity);
}
