package com.qzh.design.pattern.creational.abstractfactory;

/**
 * @ClassName JavaVideo
 * @Author DiangD
 * @Date 2020/6/30
 * @Version 1.0
 * @Description
 **/
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制java课程");
    }
}
