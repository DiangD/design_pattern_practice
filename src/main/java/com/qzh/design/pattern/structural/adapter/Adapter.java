package com.qzh.design.pattern.structural.adapter;

/**
 * @ClassName Adapter
 * @Author DiangD
 * @Date 2021/1/2
 * @Version 1.0
 * @Description 电源适配器 将220V交流电转换为5V直流电
 **/
public class Adapter implements DC5 {

    private final AC220 ac220 = new AC220();

    @Override
    public int outputDC() {
        int outputAC220V = ac220.outputAC220V();
        int transfer = outputAC220V / 44;
        System.out.println("转换成"+transfer+"V的直流电");
        return transfer;
    }
}
