package com.qzh.design.principle.singleresponsibity;

/**
 * @ClassName CourseImpl
 * @Author DiangD
 * @Date 2020/6/27
 * @Version 1.0
 * @Description 单一职责原则
 **/
public class CourseImpl implements ICourseManager,ICourseContent {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
