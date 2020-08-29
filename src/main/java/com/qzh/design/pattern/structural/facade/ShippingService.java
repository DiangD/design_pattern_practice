package com.qzh.design.pattern.structural.facade;

/**
 * @ClassName ShippingService
 * @Author DiangD
 * @Date 2020/8/29
 * @Version 1.0
 * @Description 物流系统
 **/
public class ShippingService {
    public String shipGift(PointsGift pointsGift) {
        System.out.println(pointsGift.getName()+"进入物流系统");
        String orderNum = String.valueOf(System.currentTimeMillis());
        return  orderNum;

    }
}
