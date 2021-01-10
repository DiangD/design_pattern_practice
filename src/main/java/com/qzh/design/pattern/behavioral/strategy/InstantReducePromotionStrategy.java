package com.qzh.design.pattern.behavioral.strategy;

/**
 * @ClassName InstantReducePromotionStrategy
 * @Author DiangD
 * @Date 2021/1/11
 * @Version 1.0
 * @Description
 **/
public class InstantReducePromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("立减促销,课程的价格直接减去配置的价格");
    }
}
