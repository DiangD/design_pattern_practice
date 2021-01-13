package com.qzh.design.pattern.behavioral.memento;

import java.util.Stack;

/**
 * @ClassName ArticleMementoManager
 * @Author DiangD
 * @Date 2021/1/13
 * @Version 1.0
 * @Description 备忘录模式
 **/
public class ArticleMementoManager {
    private final Stack<ArticleMemento> stack = new Stack<>();

    public ArticleMemento getMemento() {
        return stack.pop();
    }

    public void addMemento(ArticleMemento memento) {
        stack.push(memento);
    }
}
