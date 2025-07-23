package com.javabasedconfig;

public class Desktop implements Computer{
    @Override
    public void compile() {
        System.out.println("Desktop compile");
    }

    public Desktop() {
        System.out.println("Desktop created");
    }
}
