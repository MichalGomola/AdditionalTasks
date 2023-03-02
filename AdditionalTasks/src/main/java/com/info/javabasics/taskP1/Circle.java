package com.info.javabasics.taskP1;

import static java.lang.Math.*;

public class Circle extends Shape{
    private double r;

    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }

    @Override
    public void rescale(int times) {
        this.r = this.r * times;
    }

    @Override
    public double calculateArea() {
        return round(PI * pow(r,2)*100)/100.0;
    }

    @Override
    public String toString() {
        return "Circle r " + r ;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
