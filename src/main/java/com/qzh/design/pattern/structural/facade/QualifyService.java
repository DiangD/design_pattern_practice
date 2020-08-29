package com.qzh.design.pattern.structural.facade;

/**
 * @ClassName QualifyService
 * @Author DiangD
 * @Date 2020/8/29
 * @Version 1.0
 * @Description 校验系统
 **/
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验"+pointsGift.getName()+"积分资格通过，库存通过");
        return true;
    }
}
