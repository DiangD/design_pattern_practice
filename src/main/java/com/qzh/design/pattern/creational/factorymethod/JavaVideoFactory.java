package com.qzh.design.pattern.creational.factorymethod;

/**
 * @ClassName JavaVideoFactory
 * @Author DiangD
 * @Date 2020/6/29
 * @Version 1.0
 * @Description
 **/
public class JavaVideoFactory implements VideoFactory {
    @Override
    public Video getInstance() {
        return new JavaVideo();
    }
}
