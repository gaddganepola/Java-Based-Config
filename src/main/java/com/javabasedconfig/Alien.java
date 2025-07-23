package com.javabasedconfig;

public class Alien {
    private int age;
    private int salary;
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

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Coding...");
        com.compile();
    }
}
