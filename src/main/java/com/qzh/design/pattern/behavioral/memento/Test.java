package com.qzh.design.pattern.behavioral.memento;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2021/1/13
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        ArticleMementoManager manager = new ArticleMementoManager();
        Article article = new Article("备忘录设计模式", "....", "test.png");
        //存档
        ArticleMemento memento = article.saveToMemento();
        manager.addMemento(memento);
        System.out.println(article);

        //修改内容
        article.setTitle("单例模式");
        article.setContent("double check");
        System.out.println(article);

        //回档
        memento = manager.getMemento();
        article.undoFromMemento(memento);

        System.out.println(article);
    }
}
