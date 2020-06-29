package com.qzh.design.principle.dependenceinversion;

/**
 * @ClassName DiangD
 * @Author DiangD
 * @Date 2020/6/27
 * @Version 1.0
 * @Description
 **/
public class DiangD {

    private ICourse iCourse;

    public DiangD() {
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public DiangD(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse() {
        if (iCourse != null) {
            iCourse.studyCourse();
        } else {
            throw new NullPointerException();
        }
    }

}
