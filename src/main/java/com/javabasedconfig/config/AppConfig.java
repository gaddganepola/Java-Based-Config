package com.javabasedconfig.config;

import com.javabasedconfig.Alien;
import com.javabasedconfig.Computer;
import com.javabasedconfig.Desktop;
import com.javabasedconfig.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.javabasedconfig")
public class AppConfig {

////    @Bean(name = "desk")
////    @Bean(name = {"desktop", "desk", "com"})
//    @Bean
////    @Scope("prototype")
//    @Primary
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
////    Manual assign
////    @Bean
////    public Alien alien() {
////        Alien obj = new Alien();
////        obj.setAge(30);
////        obj.setSalary(1000);
////        obj.setCom(desktop());
////        return obj;
////    }
//
////    Use Autowire
////    @Bean
////    public Alien alien(@Autowired Computer com) {
////        Alien obj = new Alien();
////        obj.setAge(30);
////        obj.setSalary(1000);
////        obj.setCom(com);
////        return obj;
////    }
//
////    Use Qualifier
////    @Bean
////    public Alien alien(@Autowired @Qualifier("laptop") Computer com) {
////        Alien obj = new Alien();
////        obj.setAge(30);
////        obj.setSalary(1000);
////        obj.setCom(com);
////        return obj;
////    }
//
////    Use Primary Bean
//    @Bean
//    public Alien alien(Computer com) {
//        Alien obj = new Alien();
//        obj.setAge(30);
//        obj.setSalary(1000);
//        obj.setCom(com);
//        return obj;
//    }
//
//    @Bean
//    public Laptop laptop() {
//        return new Laptop();
//    }
}
