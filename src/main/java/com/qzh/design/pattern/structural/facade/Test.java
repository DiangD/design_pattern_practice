package com.qzh.design.pattern.structural.facade;
import com.qzh.design.pattern.structural.facade.QualifyService;
import com.qzh.design.pattern.structural.facade.PointsPaymentService;
import com.qzh.design.pattern.structural.facade.ShippingService;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2020/8/29
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        PointsGift gift = new PointsGift("MacBook");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(gift);
    }
}
