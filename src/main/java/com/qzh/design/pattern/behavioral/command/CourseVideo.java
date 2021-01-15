package com.qzh.design.pattern.behavioral.command;

/**
 * @ClassName CourseVideo
 * @Author DiangD
 * @Date 2021/1/15
 * @Version 1.0
 * @Description
 **/
public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(name+"课程视频开放");
    }

    public void close() {
        System.out.println(name+"课程视频关闭");
    }
}
