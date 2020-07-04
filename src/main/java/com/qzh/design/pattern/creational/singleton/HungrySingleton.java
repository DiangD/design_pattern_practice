package com.qzh.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @ClassName HungrySingleton
 * @Author DiangD
 * @Date 2020/7/4
 * @Version 1.0
 * @Description 饿汉式
 **/
public class HungrySingleton implements Serializable {
    public static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton() {
        if (HUNGRY_SINGLETON!=null) {
            throw new RuntimeException("禁止在单例模式使用反射");
        }
    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }


}
