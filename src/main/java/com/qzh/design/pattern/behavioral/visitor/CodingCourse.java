package com.qzh.design.pattern.behavioral.visitor;

/**
 * @ClassName CodingCourse
 * @Author DiangD
 * @Date 2021/1/18
 * @Version 1.0
 * @Description
 **/
public class CodingCourse extends Course{

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
