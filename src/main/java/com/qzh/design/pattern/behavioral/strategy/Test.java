package com.qzh.design.pattern.behavioral.strategy;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2021/1/11
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new InstantReducePromotionStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new FullReducePromotionStrategy());
        PromotionActivity promotionActivity1212 = new PromotionActivity(new CashbackPromotionStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();
        promotionActivity1212.executePromotionStrategy();
        System.out.println("=============================");

        PromotionStrategy cashback = PromotionStrategyFactory.getPromotionStrategy("Cashback");
        PromotionActivity cashback1111 = new PromotionActivity(cashback);
        cashback1111.executePromotionStrategy();
    }
}
