package com.company;

import java.util.Scanner;

public class Rectangle {
    public int side1 ;
    public int side2 ;

    public void areaRectangle()
    {
        Scanner scan = new Scanner(System.in);
        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        System.out.println("area of rectangle:" + side1*side2);
    }

    public void perimeterRectangle()
    {
        Scanner scan = new Scanner(System.in);
        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        System.out.println("perimeter of rectangle:" + 2*(side1+side2) );
    }
}
