package com.qzh.design.pattern.structural.facade;

/**
 * @ClassName GiftExchangeService
 * @Author DiangD
 * @Date 2020/8/29
 * @Version 1.0
 * @Description 外观系统
 **/
public class GiftExchangeService {
    //3个子系统
    private final QualifyService qualifyService = new QualifyService();
    private final PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private final ShippingService shippingService = new ShippingService();


    public void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvailable(pointsGift)) {
            if (pointsPaymentService.pay(pointsGift)) {
                String orderNum = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功，订单号是："+orderNum);

            }
        }
    }
}
