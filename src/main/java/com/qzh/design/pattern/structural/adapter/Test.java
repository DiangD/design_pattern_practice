package com.qzh.design.pattern.structural.adapter;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2021/1/2
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        System.out.println("adapter.outputDC() = " + adapter.outputDC());
    }
}
