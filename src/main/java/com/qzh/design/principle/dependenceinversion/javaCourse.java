package com.qzh.design.principle.dependenceinversion;

/**
 * @ClassName javaCourse
 * @Author DiangD
 * @Date 2020/6/27
 * @Version 1.0
 * @Description
 **/
public class javaCourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("DiangD is studying java");
    }
}
