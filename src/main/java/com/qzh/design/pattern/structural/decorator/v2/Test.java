package com.qzh.design.pattern.structural.decorator.v2;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2020/8/30
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        ABatterCake aBatterCake;
        aBatterCake = new BatterACake();
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);
        System.out.println( aBatterCake.getDesc()+":"+aBatterCake.cost());
    }
}
