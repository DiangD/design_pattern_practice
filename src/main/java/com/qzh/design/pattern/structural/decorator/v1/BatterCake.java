package com.qzh.design.pattern.structural.decorator.v1;

/**
 * @ClassName BatterCake
 * @Author DiangD
 * @Date 2020/8/30
 * @Version 1.0
 * @Description
 **/
public class BatterCake {
    protected String getDesc() {
        return "煎饼";
    }

    protected int cost() {
        return 8;
    }
}
