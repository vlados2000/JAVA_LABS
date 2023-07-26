package com.qa.model;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String move() {
        return "Miaaaw, one more minute ...";
    }

    @Override
    public String sayHello() {
        return "Hello, have something for me ? ";
    }

    @Override
    public String toString() {
        return "Cat:" + super.toString();
    }
}
