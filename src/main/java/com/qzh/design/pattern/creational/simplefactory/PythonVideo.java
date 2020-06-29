package com.qzh.design.pattern.creational.simplefactory;

/**
 * @ClassName JavaVideo
 * @Author DiangD
 * @Date 2020/6/28
 * @Version 1.0
 * @Description
 **/
public class PythonVideo extends Video{
    @Override
    public void produce() {
        System.out.println("produce python video");
    }
}
