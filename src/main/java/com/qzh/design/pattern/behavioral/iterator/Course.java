package com.qzh.design.pattern.behavioral.iterator;

/**
 * @ClassName Course
 * @Author DiangD
 * @Date 2021/1/8
 * @Version 1.0
 * @Description
 **/
public class Course {
    private final String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
