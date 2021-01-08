package com.qzh.design.pattern.behavioral.templatemethod;

/**
 * @ClassName ACourse
 * @Author DiangD
 * @Date 2021/1/8
 * @Version 1.0
 * @Description 模板方法模式 提供可供自定义的方法
 **/
public abstract class ACourse {
    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()) {
            this.writeArticle();
        }
        packageCourse();
    }

    abstract void packageCourse();

    final void makeVideo() {
        System.out.println("制作视频");
    }

    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void writeArticle() {
        System.out.println("编写手记");
    }

    //hook
    protected boolean needWriteArticle() {
        return false;
    }
}
