package com.qzh.design.pattern.behavioral.command;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2021/1/15
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        CourseVideo video = new CourseVideo("java");
        CourseVideo video1 = new CourseVideo("python");
        Staff staff = new Staff();
        staff.addCommand(new OpenCourseVideoCommand(video))
                .addCommand(new CloseCourseVideoCommand(video))
                .addCommand(new OpenCourseVideoCommand(video1));
        staff.executeCommands();
    }
}
