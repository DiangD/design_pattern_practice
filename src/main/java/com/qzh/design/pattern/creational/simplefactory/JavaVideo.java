package com.qzh.design.pattern.creational.simplefactory;

/**
 * @ClassName JavaVideo
 * @Author DiangD
 * @Date 2020/6/28
 * @Version 1.0
 * @Description
 **/
public class JavaVideo  extends Video{
    @Override
    public void produce() {
        System.out.println("produce java video");
    }
}
