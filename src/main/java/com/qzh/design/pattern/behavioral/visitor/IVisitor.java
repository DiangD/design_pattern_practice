package com.qzh.design.pattern.behavioral.visitor;

import com.qzh.design.pattern.creational.singleton.T;

public interface IVisitor {
    void visit(CodingCourse course);
    void visit(FreeCourse course);
}
