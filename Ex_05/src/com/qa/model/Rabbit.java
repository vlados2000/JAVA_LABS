package com.qa.model;

public class Rabbit extends Animal {

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public String move() {
        return "Hope we go get some carrots";
    }

    @Override
    public String sayHello() {
        return "MIMIMIMIMIMIMIMIMIMI";
    }

    @Override
    public String toString() {
        return "Rabbit: " + super.toString();
    }
}
