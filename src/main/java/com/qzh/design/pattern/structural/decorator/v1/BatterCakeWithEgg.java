package com.qzh.design.pattern.structural.decorator.v1;

/**
 * @ClassName BatterCakeWithEgg
 * @Author DiangD
 * @Date 2020/8/30
 * @Version 1.0
 * @Description
 **/
public class BatterCakeWithEgg extends BatterCake {
    @Override
    public String getDesc() {
        return super.getDesc()+"加鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
