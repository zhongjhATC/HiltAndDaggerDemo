package com.zhongjh.mydefault;

/**
 * @author zhongjh
 * @date 2022/4/24
 */
public class MainModel {

    public MainModel(MainParameter mainParameter) {
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
