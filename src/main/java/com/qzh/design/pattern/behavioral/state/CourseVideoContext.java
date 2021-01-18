package com.qzh.design.pattern.behavioral.state;

/**
 * @ClassName CourseVideoContext
 * @Author DiangD
 * @Date 2021/1/18
 * @Version 1.0
 * @Description 状态模式
 **/
public class CourseVideoContext {
    private CourseVideoState courseVideoState;

    public final static PlayState PLAY_STATE = new PlayState();
    public final static StopState STOP_STATE = new StopState();
    public final static PauseState PAUSE_STATE = new PauseState();
    public final static SpeedState SPEED_STATE = new SpeedState();

    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;
        this.courseVideoState.setCourseVideoContext(this);
    }

    public void play() {
        this.courseVideoState.play();
    }

    public void pause() {
        this.courseVideoState.pause();
    }

    public void Speed() {
        this.courseVideoState.speed();
    }

    public void stop() {
        this.courseVideoState.stop();
    }
}
