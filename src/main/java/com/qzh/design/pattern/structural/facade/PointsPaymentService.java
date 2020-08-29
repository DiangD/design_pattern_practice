package com.qzh.design.pattern.structural.facade;

/**
 * @ClassName PointsPaymentService
 * @Author DiangD
 * @Date 2020/8/29
 * @Version 1.0
 * @Description 支付系统
 **/
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift) {
        //扣减积分
        System.out.println("支付"+pointsGift.getName()+"积分成功");
        return true;
    }
}
