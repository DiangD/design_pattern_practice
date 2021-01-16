package com.qzh.design.pattern.behavioral.chainofresponsibility;

/**
 * @ClassName Approver
 * @Author DiangD
 * @Date 2021/1/16
 * @Version 1.0
 * @Description 责任链模式  Servlet Filter、Spring Security Filter
 **/
public abstract class Approver {
    protected Approver approver;

    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
