package com.info.javabasics.taskP1;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App
{
    private static Scanner scan = new Scanner(System.in);
    public static void main( String[] args ) {
        double a;
        double b;
        Shape shape = null;
        switch (getFigureNumber()){
            case 1:
                System.out.println("Podaj wartość boku a: ");
                a = getSize();
                shape = new Square("Square", a);
                break;
            case 2:
                System.out.println("Podaj wartość boku a: ");
                a = getSize();
                System.out.println("Podaj wartość boku b: ");
                b = getSize();
                shape = new Rectangle("Rectangle", a, b);
                break;
            case 3:
                System.out.println("Podaj wartość promienia: ");
                a = getSize();
                shape = new Circle("Circle", a);
                break;
            default: break;
        }
        System.out.println(shape);
        System.out.println("Pole twojej figury: " + shape.calculateArea());
        if (doYouWantToRescale()) {
            System.out.println("Podaj ile razy chcesz zmienić swoją figurę: ");
            int times = getHowManyTimes();
            shape.rescale(times);
            System.out.println(shape);
            System.out.println("Pole twojej figury: " + shape.calculateArea());
        }
        scan.close();


    }
    private static int getFigureNumber() {

        System.out.println("Podaj, dla której figur chcesz obliczyć pole: ");
        System.out.println("1. Kwadrat");
        System.out.println("2. Prostokąt");
        System.out.println("3. Koło");

        String figure = scan.nextLine();
        while (isInputInvalid(figure))        {
            System.out.println("Zła wartość, spróbuj ponownie.");
            figure = scan.nextLine();
        }
        return Integer.parseInt(figure);
    }

    private static boolean isInputInvalid(String input) {
        String validPattern = "[1-3]";
        return !Pattern.matches(validPattern,input);
    }

    private static double getSize(){
        Double a =  null;
        while (isInputNull(a)) {
            try {
                a = scan.nextDouble();
                if (a < 0) {
                    a = null;
                    System.out.println("Zła wartość, spróbuj ponownie.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Zła wartość, spróbuj ponownie.");
                scan.next();
            }
        }
        return a;
    }

    private static int getHowManyTimes(){
        Integer a =  null;
        while (isInputNull(a)) {
            try {
                a = scan.nextInt();
                if (a < 0) {
                    a = null;
                    System.out.println("Zła wartość, spróbuj ponownie.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Zła wartość, spróbuj ponownie.");
                scan.next();
            }
        }
        return a;
    }

    private static boolean isInputNull(Object o) {
        return o == null;
    }

    private static boolean doYouWantToRescale() {
        System.out.println("\nCzy chcesz przeskalować swoją figurę (T/N)?");
        String input = scan.nextLine().toUpperCase();
        while (isInvalid(input)) {
            System.out.println("Podaj T lub N");
            input = scan.nextLine().toUpperCase();
        }
        return "T".equals(input);
    }

    private static boolean isInvalid(String input) {
        String validPattern = "[TN]";
        return !Pattern.matches(validPattern, input);
    }
}
