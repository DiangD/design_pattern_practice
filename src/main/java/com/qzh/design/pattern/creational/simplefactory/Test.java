package com.qzh.design.pattern.creational.simplefactory;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2020/6/28
 * @Version 1.0
 * @Description 简单工厂模式
 **/
public class Test {
    public static void main(String[] args) {
        Video video = VideoSimpleFactory.getInstance(JavaVideo.class);
        if (video != null) {
            video.produce();
        }

        Video python = VideoSimpleFactory.getVideo("python");
        python.produce();
    }
}
