package com.qzh.design.pattern.behavioral.command;

/**
 * @ClassName OpenCourseVideoCommand
 * @Author DiangD
 * @Date 2021/1/15
 * @Version 1.0
 * @Description
 **/
public class OpenCourseVideoCommand implements Command{

    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    public void setCourseVideo(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
