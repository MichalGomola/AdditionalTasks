package com.info.javabasics;

public class Square extends Shape{
    double a;
    public Square(String name, double a) {
        super(name);
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return Math.pow(a,2);
    }

    @Override
    public String toString() {
        return "Square "+ a + "x" + a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
