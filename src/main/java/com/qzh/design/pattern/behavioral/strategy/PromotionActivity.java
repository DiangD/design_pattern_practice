package com.qzh.design.pattern.behavioral.strategy;

/**
 * @ClassName PromotionActivity
 * @Author DiangD
 * @Date 2021/1/11
 * @Version 1.0
 * @Description
 **/
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity() {
    }

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void setPromotionStrategy(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }
}
