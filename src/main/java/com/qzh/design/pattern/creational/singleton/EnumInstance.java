package com.qzh.design.pattern.creational.singleton;

/**
 * @ClassName EnumInstance
 * @Author DiangD
 * @Date 2020/7/4
 * @Version 1.0
 * @Description 枚举类创建单例
 **/
public enum  EnumInstance {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
