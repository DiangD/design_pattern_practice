package com.qzh.design.pattern.behavioral.templatemethod;

/**
 * @ClassName DesignPatternCourse
 * @Author DiangD
 * @Date 2021/1/8
 * @Version 1.0
 * @Description
 **/
public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
