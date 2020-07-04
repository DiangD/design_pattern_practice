package com.qzh.design.pattern.creational.singleton;

/**
 * @ClassName T
 * @Author DiangD
 * @Date 2020/7/3
 * @Version 1.0
 * @Description
 **/
public class T implements Runnable {
    @Override
    public void run() {
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}
