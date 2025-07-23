package com.javabasedconfig.config;

import com.javabasedconfig.Alien;
import com.javabasedconfig.Computer;
import com.javabasedconfig.Desktop;
import com.javabasedconfig.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

//    @Bean(name = "desk")
//    @Bean(name = {"desktop", "desk", "com"})
    @Bean
//    @Scope("prototype")
    public Desktop desktop() {
        return new Desktop();
    }

    @Bean
    public Alien alien(@Autowired Computer com) {
        Alien obj = new Alien();
        obj.setAge(30);
        obj.setSalary(1000);
        obj.setCom(com);
        return obj;
    }

    @Bean
    public Laptop lapto() {
        return new Laptop();
    }
}
