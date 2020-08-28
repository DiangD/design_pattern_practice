package com.qzh.design.pattern.creational.prototype.clone;

import com.qzh.design.pattern.creational.singleton.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2020/8/28
 * @Version 1.0
 * @Description 深克隆 浅克隆
 **/
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇", birthday);
        Pig pig2 = (Pig) pig1.clone();
        birthday.setTime(System.currentTimeMillis());
        System.out.println("pig1 = " + pig1);
        System.out.println("pig2 = " + pig2);

        //防止clone破坏单例 1. 不实现cloneable 2.返回单例对象
//        HungrySingleton singleton = HungrySingleton.getInstance();
//        Class<? extends HungrySingleton> singletonClass = singleton.getClass();
//        Method method = singletonClass.getDeclaredMethod("clone");
//        method.setAccessible(true);
//        HungrySingleton invokeSingleton = (HungrySingleton) method.invoke(singleton);
//        System.out.println(singleton == invokeSingleton);
    }
}
