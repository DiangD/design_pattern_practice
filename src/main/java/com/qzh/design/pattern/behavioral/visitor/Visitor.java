package com.qzh.design.pattern.behavioral.visitor;

/**
 * @ClassName Visitor
 * @Author DiangD
 * @Date 2021/1/18
 * @Version 1.0
 * @Description 访问者模式
 **/
public class Visitor implements IVisitor {
    @Override
    public void visit(CodingCourse course) {
        System.out.println("收费课程：" + course.getName() + ",价格：" + course.getPrice());
    }

    @Override
    public void visit(FreeCourse course) {
        System.out.println("免费课程：" + course.getName());
    }
}
