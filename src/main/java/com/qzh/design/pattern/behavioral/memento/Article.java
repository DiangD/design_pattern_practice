package com.qzh.design.pattern.behavioral.memento;

/**
 * @ClassName Article
 * @Author DiangD
 * @Date 2021/1/13
 * @Version 1.0
 * @Description
 **/
public class Article {
    private String title;
    private String content;
    private String images;

    public Article(String title, String content, String images) {
        this.title = title;
        this.content = content;
        this.images = images;
    }

    public Article() {
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


    public ArticleMemento saveToMemento() {
        return new ArticleMemento(title, content, images);
    }

    public void undoFromMemento(ArticleMemento memento) {
        title = memento.getTitle();
        content = memento.getContent();
        images = memento.getImages();
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", images='" + images + '\'' +
                '}';
    }
}
