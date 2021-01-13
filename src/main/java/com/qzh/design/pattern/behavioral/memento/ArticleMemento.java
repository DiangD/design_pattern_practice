package com.qzh.design.pattern.behavioral.memento;

/**
 * @ClassName ArticleMemento
 * @Author DiangD
 * @Date 2021/1/13
 * @Version 1.0
 * @Description
 **/
public class ArticleMemento {
    private String title;
    private String content;
    private String images;

    public ArticleMemento(String title, String content, String images) {
        this.title = title;
        this.content = content;
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
}
