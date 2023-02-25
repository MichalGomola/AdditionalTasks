package com.info.javabasics;


public class App 
{
    public static void main( String[] args )
    {
        Square square1 = new Square("sq1", 5);
        Rectangle rec1 = new Rectangle("rec1", 5, 10);
        Circle circle1 = new Circle("Circle1", 5);

        System.out.println(square1 + ", pole: " +square1.calculateArea());
        System.out.println(rec1 +", pole: " +rec1.calculateArea());
        System.out.println(circle1 + ", pole: " +circle1.calculateArea());

    }
}
