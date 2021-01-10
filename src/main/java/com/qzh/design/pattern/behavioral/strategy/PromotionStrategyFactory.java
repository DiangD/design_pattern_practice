package com.qzh.design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PromotionStrategyFactory
 * @Author DiangD
 * @Date 2021/1/11
 * @Version 1.0
 * @Description 享元模式优化
 **/
public class PromotionStrategyFactory {
    private final static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionStrategyKey.fullReduce, new FullReducePromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionStrategyKey.instantReduce, new InstantReducePromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionStrategyKey.Cashback, new CashbackPromotionStrategy());
    }

    private PromotionStrategyFactory() {
    }

    private final static PromotionStrategy EMPTY_PROMOTION_STRATEGY = new EmptyPromotionStrategy();

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? EMPTY_PROMOTION_STRATEGY : promotionStrategy;
    }

    private interface PromotionStrategyKey {
        String fullReduce = "FullReduce";
        String instantReduce = "InstantReduce";
        String Cashback = "Cashback";

    }
}

class EmptyPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("无效促销活动");
    }
}

