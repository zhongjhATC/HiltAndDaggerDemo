package com.zhongjh.mydagger2.module;

import javax.inject.Inject;

/**
 * @author zhongjh
 * @date 2022/4/24
 */
public class MainEntity {

    @Inject
    public MainEntity(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
