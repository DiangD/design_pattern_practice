package com.qzh.design.pattern.creational.simplefactory;

/**
 * @ClassName VideoFactory
 * @Author DiangD
 * @Date 2020/6/28
 * @Version 1.0
 * @Description
 **/
public class VideoSimpleFactory {
    public static Video getInstance(Class<? extends Video> c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

    public static Video getVideo(String type) {
        Video video = null;
        if ("java".equalsIgnoreCase(type)) {
            video = new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            video = new PythonVideo();
        }
        return video;
    }
}
