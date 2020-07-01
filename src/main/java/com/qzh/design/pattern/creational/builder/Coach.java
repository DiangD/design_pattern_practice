package com.qzh.design.pattern.creational.builder;

/**
 * @ClassName Coach
 * @Author DiangD
 * @Date 2020/7/1
 * @Version 1.0
 * @Description
 **/
public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    //    private String courseName;
//    private String coursePPT;
//    private String courseVideo;
//    private String courseArticle;
//    private String courseQA;
    public Course makeCourse(String courseName, String coursePPT, String courseVideo, String courseArticle, String courseQA) {
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCoursePPt(coursePPT);
        courseBuilder.buildCourseVideo(courseVideo);
        courseBuilder.buildCourseArticle(courseArticle);
        courseBuilder.buildCourseQA(courseQA);
        return courseBuilder.makeCourse();
    }

}
