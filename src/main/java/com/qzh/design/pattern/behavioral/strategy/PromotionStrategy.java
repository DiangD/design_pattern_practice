package com.qzh.design.pattern.behavioral.strategy;

/**
 * 策略模式 优化if else结构
 * 系统有很多类，区别仅仅在于行为不同
 * 一个系统动态在几种算法（行为）中选择一种
 *
 * 缺点：用户必须了解全部策略类，但不需要知道策略的实现细节
 */
public interface PromotionStrategy {
    void doPromotion();
}
