package com.qzh.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName ReflectionAttackTest
 * @Author DiangD
 * @Date 2020/7/4
 * @Version 1.0
 * @Description 反射攻击懒汉式
 **/
public class ReflectionAttackTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<LazySingleton> objectClass = LazySingleton.class;
        Constructor<LazySingleton> constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazySingleton o1 = LazySingleton.getInstance();
        //获取flag字段
        Field flag = objectClass.getDeclaredField("flag");
        //打开权限
        flag.setAccessible(true);
        //使用反射将flag置为true
        flag.set(o1, true);
        LazySingleton o2 = constructor.newInstance();
        if (o1 != o2) {
            System.out.println("反射攻击成功");
        }

    }
}
