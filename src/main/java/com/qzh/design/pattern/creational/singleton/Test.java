package com.qzh.design.pattern.creational.singleton;

import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2020/7/3
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException, ClassNotFoundException {
        //LazySingleton instance = LazySingleton.getInstance();
//        new Thread(new T()).start();
//        new Thread(new T()).start();
//        Thread.sleep(500);
//        System.out.println("END");
        HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("hungry_singleton"));
        oos.writeObject(instance);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("hungry_singleton"));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

//        Class<HungrySingleton> objectClass = HungrySingleton.class;
//        Constructor<HungrySingleton> constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        HungrySingleton newInstance = constructor.newInstance();


//        Class<EnumInstance> objectClass = EnumInstance.class;
//        Constructor<EnumInstance> constructor = objectClass.getDeclaredConstructor(String.class,int.class);
//        constructor.setAccessible(true);
//        EnumInstance newInstance = constructor.newInstance();
//        EnumInstance instance = EnumInstance.getInstance();
//
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("hungry_singleton"));
//        oos.writeObject(instance);
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("hungry_singleton"));
//        EnumInstance newInstance = (EnumInstance) ois.readObject();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
