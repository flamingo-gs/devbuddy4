package com.devbuddy4.backend.service;


import com.devbuddy4.web.domain.FeedbackPojo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class SMTPEmailService extends AbstractEmailService {



    private static final Logger LOG = LoggerFactory.getLogger(SMTPEmailService.class);

    @Autowired
    private MailSender mailSender;


    @Override
    public void sendGenericEmailMessage(SimpleMailMessage message) {
        LOG.debug("Sending message..");
        mailSender.send(message);
        LOG.debug("Sendt..");

    }
}
