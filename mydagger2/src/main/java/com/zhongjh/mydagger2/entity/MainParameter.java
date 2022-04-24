package com.zhongjh.mydagger2.entity;

import javax.inject.Inject;

/**
 * @author zhongjh
 * @date 2022/4/24
 */
public class MainParameter {

    @Inject
    public MainParameter() {
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
