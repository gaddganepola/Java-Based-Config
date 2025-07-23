package com.javabasedconfig.config;

import com.javabasedconfig.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//    @Bean(name = "desk")
//    @Bean(name = {"desktop", "desk", "com"})
    @Bean
    public Desktop desktop() {
        return new Desktop();
    }
}
