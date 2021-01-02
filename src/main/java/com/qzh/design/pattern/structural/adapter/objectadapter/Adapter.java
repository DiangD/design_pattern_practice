package com.qzh.design.pattern.structural.adapter.objectadapter;


/**
 * @ClassName Adapter
 * @Author DiangD
 * @Date 2021/1/2
 * @Version 1.0
 * @Description 适配器
 * 对象适配器通过组合的方式实现适配，组合的弊端也很明显，大量的依赖注入，增加适配者时，大量的if/else破坏开闭原则
 **/
public class Adapter implements Target{
    private final Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
