package com.qzh.design.pattern.creational.prototype.abstcact;

/**
 * @ClassName A
 * @Author DiangD
 * @Date 2020/8/28
 * @Version 1.0
 * @Description
 **/
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
