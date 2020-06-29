package com.qzh.design.principle.openclose;

/**
 * @ClassName JavaDiscountPrice
 * @Author DiangD
 * @Date 2020/6/27
 * @Version 1.0
 * @Description
 **/
public class JavaDiscountPrice extends JavaCourse {


    public JavaDiscountPrice() {
    }

    public JavaDiscountPrice(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }

    public Double getOriginalPrice() {
        return super.getPrice();
    }
}
