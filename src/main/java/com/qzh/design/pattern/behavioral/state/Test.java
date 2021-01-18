package com.qzh.design.pattern.behavioral.state;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2021/1/18
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        CourseVideoContext context = new CourseVideoContext();
        context.setCourseVideoState(CourseVideoContext.PLAY_STATE);
        System.out.println("当前状态：" + context.getCourseVideoState().getClass().getSimpleName());
        context.pause();
        System.out.println("当前状态：" + context.getCourseVideoState().getClass().getSimpleName());
        context.Speed();
        System.out.println("当前状态：" + context.getCourseVideoState().getClass().getSimpleName());
        context.stop();
        System.out.println("当前状态：" + context.getCourseVideoState().getClass().getSimpleName());
        context.Speed();
    }
}
