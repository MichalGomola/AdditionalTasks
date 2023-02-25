package com.info.javabasics;

public abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract double calculateArea();

}
