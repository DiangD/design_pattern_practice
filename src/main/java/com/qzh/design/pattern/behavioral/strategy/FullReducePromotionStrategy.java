package com.qzh.design.pattern.behavioral.strategy;

/**
 * @ClassName FullReducePromotionStrategy
 * @Author DiangD
 * @Date 2021/1/11
 * @Version 1.0
 * @Description
 **/
public class FullReducePromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满减促销,满200-20元");
    }
}
