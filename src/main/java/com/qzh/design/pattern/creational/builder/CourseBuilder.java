package com.qzh.design.pattern.creational.builder;

/**
 * @ClassName CourseBuilder
 * @Author DiangD
 * @Date 2020/7/1
 * @Version 1.0
 * @Description
 **/
public abstract class CourseBuilder {
//    private String courseName;
//    private String coursePPT;
//    private String courseVideo;
//    private String courseArticle;
//    private String courseQA;

    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPt(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
