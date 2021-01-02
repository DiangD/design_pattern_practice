package com.qzh.design.pattern.structural.adapter;

/**
 * @ClassName AC220
 * @Author DiangD
 * @Date 2021/1/2
 * @Version 1.0
 * @Description 220V交流电
 **/
public class AC220 {
    public int outputAC220V(){
        final int output  =220;
        System.out.println("输出"+output+"V的交流电");
        return output;
    }
}
