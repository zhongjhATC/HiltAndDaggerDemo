package com.zhongjh.mydagger2.module;

import dagger.Module;
import dagger.Provides;

/**
 * @author zhongjh
 * @date 2022/4/24
 */
@Module
public class MainModule {

    String name;

    public MainModule(String name) {
        this.name = name;
    }

    @Provides
    MainEntity provideMainParameter() {
        return new MainEntity(name);
    }

}
