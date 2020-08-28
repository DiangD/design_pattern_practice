package com.qzh.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @ClassName MailUtil
 * @Author DiangD
 * @Date 2020/8/28
 * @Version 1.0
 * @Description
 **/
public class MailUtil {
    public static void sendMail(Mail mail) {
        String outputContent = "向{0}同学，邮件地址{1}，邮件内容：{2}发送邮件。";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginMail(Mail mail) {
        System.out.println("存储originMail记录，origin Mail："+mail.getContent());
    }
}
