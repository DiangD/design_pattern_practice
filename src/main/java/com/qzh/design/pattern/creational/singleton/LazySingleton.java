package com.qzh.design.pattern.creational.singleton;

/**
 * @ClassName LazySingleton
 * @Author DiangD
 * @Date 2020/7/3
 * @Version 1.0
 * @Description 懒汉式
 **/
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private volatile static boolean flag = true;

    private LazySingleton() {
        if (flag) {
            flag = false;
        } else {
            throw new RuntimeException("禁止在单例模式使用反射");
        }
    }

    public synchronized static LazySingleton getInstance() {
        //延迟加载
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }



//    与上面的写法是一致的
//    public  static LazySingleton getInstance() {
//        synchronized (LazySingleton.class) {
//            if (lazySingleton == null) {
//                lazySingleton = new LazySingleton();
//            }
//        }
//        //延迟加载
//        return lazySingleton;
//    }
}
