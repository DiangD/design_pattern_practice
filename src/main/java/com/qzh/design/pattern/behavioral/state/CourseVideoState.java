package com.qzh.design.pattern.behavioral.state;

/**
 * @ClassName CourseVideoState
 * @Author DiangD
 * @Date 2021/1/18
 * @Version 1.0
 * @Description
 **/
public abstract class CourseVideoState {
    protected CourseVideoContext courseVideoContext;

    public CourseVideoContext getCourseVideoContext() {
        return courseVideoContext;
    }

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    public abstract void play();

    public abstract void pause();

    public abstract void speed();

    public abstract void stop();

}
