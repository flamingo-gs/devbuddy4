package com.devbuddy4.backend.service;


import com.devbuddy4.web.domain.FeedbackPojo;
import org.springframework.mail.SimpleMailMessage;

public interface EmailService {
    public void sendFeedbackEmail(FeedbackPojo feedback);
    public void sendGenericEmailMessage(SimpleMailMessage message);

}
