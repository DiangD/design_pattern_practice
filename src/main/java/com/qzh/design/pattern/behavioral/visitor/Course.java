package com.qzh.design.pattern.behavioral.visitor;

/**
 * @ClassName Course
 * @Author DiangD
 * @Date 2021/1/18
 * @Version 1.0
 * @Description
 **/
public abstract class Course {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(IVisitor visitor);
}
