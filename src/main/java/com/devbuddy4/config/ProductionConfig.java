package com.devbuddy4.config;

import com.devbuddy4.backend.service.EmailService;
import com.devbuddy4.backend.service.SMTPEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("prod")
@PropertySource("file:///${user.home}/.devbuddy4/application-prod.properties")

public class ProductionConfig {

    @Bean
    public EmailService emailService(){
        return new SMTPEmailService();
    }
}
