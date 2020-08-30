package com.qzh.design.pattern.structural.decorator.v2;

/**
 * @ClassName SausageDecorator
 * @Author DiangD
 * @Date 2020/8/30
 * @Version 1.0
 * @Description
 **/
public class SausageDecorator  extends AbstractDecorator{
    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
