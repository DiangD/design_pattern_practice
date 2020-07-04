package com.qzh.design.pattern.creational.singleton;

/**
 * @ClassName StaticInnerClassSingleton
 * @Author DiangD
 * @Date 2020/7/4
 * @Version 1.0
 * @Description 基于类初始化的延迟加载方案
 * 类初始化时，线程会去争夺Class对象的初始化锁，对重排序不可见。
 **/
public class StaticInnerClassSingleton {
    private  static class InnerClass{
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.instance;
    }
}
