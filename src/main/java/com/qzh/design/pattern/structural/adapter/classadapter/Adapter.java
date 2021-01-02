package com.qzh.design.pattern.structural.adapter.classadapter;

/**
 * @ClassName Adapter
 * @Author DiangD
 * @Date 2021/1/2
 * @Version 1.0
 * @Description 适配者
 * 通过继承的方式来实现适配，弊端：java为单继承无法实现多适配
 **/
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
