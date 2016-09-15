package com.devbuddy4.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class i18NConfig {

    /** The application logger */
    private static final Logger LOG = LoggerFactory.getLogger(i18NConfig.class);

    @Bean
    public ReloadableResourceBundleMessageSource messageSource (){

        //the function name MUST be messageSource
        ReloadableResourceBundleMessageSource resourceBundleMessageSource = new ReloadableResourceBundleMessageSource();
        //will look for a folder i18n/messages.properties
        resourceBundleMessageSource.setBasename("classpath:i18n/messages");
        resourceBundleMessageSource.setCacheSeconds(1800);
        return resourceBundleMessageSource;
    }
}
