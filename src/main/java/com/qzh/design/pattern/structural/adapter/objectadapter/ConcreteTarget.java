package com.qzh.design.pattern.structural.adapter.objectadapter;

import com.qzh.design.pattern.structural.adapter.classadapter.Target;

/**
 * @ClassName ConcreteTarget
 * @Author DiangD
 * @Date 2021/1/2
 * @Version 1.0
 * @Description 目标对象
 **/
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget目标方法");
    }
}
