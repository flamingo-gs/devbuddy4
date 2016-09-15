package com.devbuddy4.backend.service;


import com.devbuddy4.web.domain.FeedbackPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

public abstract class AbstractEmailService implements EmailService{

    @Value("${default.to.address}")
    private String defaultToAddress;

    protected SimpleMailMessage prepareSimpleMailMessageFromFeedbackPojo(FeedbackPojo feedback){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(defaultToAddress);
        message.setFrom(feedback.getEmail());
        message.setSubject("[DevOps Buddy]: Feedback received from"
                + feedback.getFirstName() + " " + feedback.getLastName());
        message.setText(feedback.getFeedBack());
        return message;
    }

    @Override
    public void sendFeedbackEmail(FeedbackPojo feedback) {
        sendGenericEmailMessage(prepareSimpleMailMessageFromFeedbackPojo(feedback));
    }
}