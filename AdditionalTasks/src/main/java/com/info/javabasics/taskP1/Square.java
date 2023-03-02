package com.info.javabasics.taskP1;

public class Square extends Shape{
    double a;
    public Square(String name, double a) {
        super(name);
        this.a = a;
    }
    @Override
    public void rescale(int times) {
        this.a = this.a * times;
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
