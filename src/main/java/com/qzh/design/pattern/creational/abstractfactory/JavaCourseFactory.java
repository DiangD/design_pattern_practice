package com.qzh.design.pattern.creational.abstractfactory;

/**
 * @ClassName JavaCourseFactory
 * @Author DiangD
 * @Date 2020/6/30
 * @Version 1.0
 * @Description
 **/
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
