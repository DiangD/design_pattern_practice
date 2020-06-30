package com.qzh.design.pattern.creational.abstractfactory;

/**
 * @ClassName PythonCourseFactory
 * @Author DiangD
 * @Date 2020/6/30
 * @Version 1.0
 * @Description
 **/
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
