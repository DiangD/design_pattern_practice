package com.qzh.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName ArticleApprover
 * @Author DiangD
 * @Date 2021/1/16
 * @Version 1.0
 * @Description
 **/
public class ArticleApprover extends Approver{
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getArticle())) {
            System.out.println(course.getName()+"含有手记，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        }else {
            System.out.println(course.getName()+"不含有手记，不批准，流程结束");
        }
    }
}
