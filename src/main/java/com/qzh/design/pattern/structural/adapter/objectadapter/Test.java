package com.qzh.design.pattern.structural.adapter.objectadapter;


/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2021/1/2
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapter = new Adapter();
        adapter.request();
    }
}
