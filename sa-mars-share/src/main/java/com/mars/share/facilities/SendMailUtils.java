package com.mars.share.facilities;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.internet.MimeMessage;
import java.io.File;
import java.net.URL;

/**
 * 发送邮件工具类
 * @author stonew1987
 * @create 2018-02-06 17:37
 **/

@Slf4j
@Component
public class SendMailUtils {

    @Autowired
    private JavaMailSender mailSender;

    /**
     * 简单发送邮件
     * @param accept   邮件接收方
     * @param subject  邮件主题
     * @param text     邮件内容
     */
    public void sendSimpleMail(String accept, String subject, String text) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("stonew1987@sina.com");
            message.setTo(accept);
            message.setSubject(subject);
            message.setText(text);
            mailSender.send(message);
        } catch (Exception e) {
            log.error("发送邮件失败", e);
        }
    }

    /**
     * 发送HTML内容邮件
     * @param accept   邮件接收方
     * @param subject  邮件主题
     * @param html     邮件内容 html格式
     */
    public void sendHtmlMail(String accept, String subject, String html) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom("stonew1987@sina.com");
            helper.setTo(accept);
            helper.setSubject(subject);
            helper.setText(html, true);
            mailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendAttachmentsMail() {
        MimeMessage message = null;
        try {
            message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom("stonew1987@sina.com");
            helper.setTo("stonew1987@sina.com");
            helper.setSubject("主题：带附件的邮件");
            helper.setText("带附件的邮件内容");
            //注意项目路径问题，自动补用项目路径
            FileSystemResource file = new FileSystemResource(new File("D:/1.png"));
            //加入邮件
            helper.addAttachment("400.png", file);
        } catch (Exception e){
            e.printStackTrace();
        }
        mailSender.send(message);
    }

}
