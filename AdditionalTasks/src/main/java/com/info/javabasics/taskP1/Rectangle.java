package com.info.javabasics.taskP1;

public class Rectangle extends Shape{
    private double a;
    private double b;

    public Rectangle(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;
    }
    @Override
    public void rescale(int times) {
        this.a = this.a * times;
        this.b = this.b * times;
    }
    @Override
    public double calculateArea() {
        return a*b;
    }

    @Override
    public String toString() {
        return "Rectangle " + a + "x" + b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
