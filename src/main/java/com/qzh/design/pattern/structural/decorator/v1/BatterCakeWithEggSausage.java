package com.qzh.design.pattern.structural.decorator.v1;

/**
 * @ClassName BatterCakeWithEggSausage
 * @Author DiangD
 * @Date 2020/8/30
 * @Version 1.0
 * @Description
 **/
public class BatterCakeWithEggSausage extends BatterCakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc() + "加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
