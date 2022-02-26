package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Square square=new Square();
        Rectangle rectangle=new Rectangle();
        System.out.println("Please enter an integer for the side of square:");
        square.areaSquare();
        System.out.println("Please repeat the number:");
        square.perimeterSquare();
        System.out.println("Please enter two integers for the side1 and side2 of rectangle:");
        rectangle.areaRectangle();
        System.out.println("Please repeat the numbers:");
        rectangle.perimeterRectangle();

    }
}
