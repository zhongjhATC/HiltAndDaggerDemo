package com.zhongjh.mydagger2.entity;

import javax.inject.Inject;

/**
 * @author zhongjh
 * @date 2022/4/24
 */
public class MainEntity {

    public MainEntity() {
    }

    /**
     * 只允许有一个 @Inject，因为Component无法区别你需要什么样的对象
     */
    @Inject
    public MainEntity(MainParameter mainParameter) {
        this.mainParameter = mainParameter;
    }

    private String name;
    private MainParameter mainParameter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MainParameter getMainParameter() {
        return mainParameter;
    }

    public void setMainParameter(MainParameter mainParameter) {
        this.mainParameter = mainParameter;
    }
}
