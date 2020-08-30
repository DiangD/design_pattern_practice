package com.qzh.design.pattern.structural.decorator.v1;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2020/8/30
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDesc() + ":" + batterCake.cost());

        BatterCake batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getDesc() + ":" + batterCakeWithEgg.cost());

        BatterCake batterCakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println(batterCakeWithEggSausage.getDesc() + ":" + batterCakeWithEggSausage.cost());
    }
}
