package com.javabasedconfig;

import org.springframework.stereotype.Component;

@Component("lap")
public class Laptop implements Computer {
    @Override
    public void compile() {
        System.out.println("Laptop is compiling");
    }

    public Laptop() {
        System.out.println("Laptop created");
    }
}
