package com.qzh.design.pattern.behavioral.strategy;

/**
 * @ClassName CashbackPromotionStrategy
 * @Author DiangD
 * @Date 2021/1/11
 * @Version 1.0
 * @Description
 **/
public class CashbackPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销,返回的金额存放到用户的余额中");
    }
}
