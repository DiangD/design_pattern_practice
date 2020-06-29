package com.qzh.design.principle.interfacesegregation;

/**
 * @ClassName Dog
 * @Author DiangD
 * @Date 2020/6/27
 * @Version 1.0
 * @Description 接口隔离性原则
 **/
public class Dog implements IAnimalEatAction,IAnimalSwimAction {
    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}
