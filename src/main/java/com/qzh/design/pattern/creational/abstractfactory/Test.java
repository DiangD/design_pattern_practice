package com.qzh.design.pattern.creational.abstractfactory;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2020/6/30
 * @Version 1.0
 * @Description 抽象工厂方法
 **/
public class Test {
    public static void main(String[] args) {
        CourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.getVideo().produce();
        javaCourseFactory.getArticle().produce();
    }
}
