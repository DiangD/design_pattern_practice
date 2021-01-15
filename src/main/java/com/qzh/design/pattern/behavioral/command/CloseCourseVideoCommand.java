package com.qzh.design.pattern.behavioral.command;

/**
 * @ClassName OpenCourseVideoCommand
 * @Author DiangD
 * @Date 2021/1/15
 * @Version 1.0
 * @Description
 **/
public class CloseCourseVideoCommand implements Command{

    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    public void setCourseVideo(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
