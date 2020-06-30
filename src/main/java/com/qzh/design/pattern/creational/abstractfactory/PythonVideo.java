package com.qzh.design.pattern.creational.abstractfactory;

/**
 * @ClassName PythonVideo
 * @Author DiangD
 * @Date 2020/6/30
 * @Version 1.0
 * @Description
 **/
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制python课程");
    }
}
