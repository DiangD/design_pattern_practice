package com.qzh.design.pattern.structural.decorator.v2;

/**
 * @ClassName AbstractDecorator
 * @Author DiangD
 * @Date 2020/8/30
 * @Version 1.0
 * @Description
 **/
public class AbstractDecorator extends ABatterCake {
    private ABatterCake aBatterCake;

    public AbstractDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    @Override
    protected String getDesc() {
        return aBatterCake.getDesc();
    }

    @Override
    protected int cost() {
        return aBatterCake.cost();
    }
}
