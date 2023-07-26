package com.qa.model;

public class Dog extends  Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String move() {
        return "Wherever you go, we ride together";
    }

    @Override
    public String sayHello() {
        return "Hello, Hello, gaughhhhhhhhhhhh";
    }

    @Override
    public String toString() {
        return "Dog:" + super.toString();
    }
}
