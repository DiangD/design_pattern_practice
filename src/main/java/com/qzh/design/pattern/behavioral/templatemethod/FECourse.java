package com.qzh.design.pattern.behavioral.templatemethod;

/**
 * @ClassName FECourse
 * @Author DiangD
 * @Date 2021/1/8
 * @Version 1.0
 * @Description
 **/
public class FECourse extends ACourse {
    private boolean needWriteArticleFlag = false;

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    public FECourse() {
    }

    @Override
    protected boolean needWriteArticle() {
        return needWriteArticleFlag;
    }
}
