package com.qzh.design.pattern.behavioral.state;

/**
 * @ClassName PlayState
 * @Author DiangD
 * @Date 2021/1/18
 * @Version 1.0
 * @Description
 **/
public class StopState extends CourseVideoState {

    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void pause() {
        System.out.println("no pause");
    }

    @Override
    public void speed() {
        System.out.println("no speed");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
