package com.javabasedconfig;

public class Laptop implements Computer {
    @Override
    public void compile() {
        System.out.println("Laptop is compiling");
    }
}
