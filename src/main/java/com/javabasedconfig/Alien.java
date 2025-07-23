package com.javabasedconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("21")
    private int age;
    @Value("10000")
    private int salary;
    @Autowired
//    @Qualifier("lap")
    private Computer com;

    public int getAge() {
        return age;
    }

    public Alien() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

//    @Autowired
    public Alien(Computer com) {
        this.com = com;
        System.out.println("Constructor Injection");
    }

    public Computer getCom() {
        return com;
    }

//    @Autowired
    public void setCom(Computer com) {
        this.com = com;
        System.out.println("Setter Injection");
    }

    public void code() {
        System.out.println("Coding...");
        com.compile();
    }
}
