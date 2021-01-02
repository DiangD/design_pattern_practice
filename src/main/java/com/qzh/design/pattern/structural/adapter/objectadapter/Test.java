package com.qzh.design.pattern.structural.adapter.objectadapter;

import com.qzh.design.pattern.structural.adapter.classadapter.Adapter;
import com.qzh.design.pattern.structural.adapter.classadapter.ConcreteTarget;
import com.qzh.design.pattern.structural.adapter.classadapter.Target;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2021/1/2
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        com.qzh.design.pattern.structural.adapter.classadapter.Target target = new ConcreteTarget();
        target.request();

        Target adapter = new Adapter();
        adapter.request();
    }
}
