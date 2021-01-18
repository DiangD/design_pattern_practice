package com.qzh.design.pattern.behavioral.visitor;

/**
 * @ClassName FreeCourse
 * @Author DiangD
 * @Date 2021/1/18
 * @Version 1.0
 * @Description
 **/
public class FreeCourse extends Course {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
