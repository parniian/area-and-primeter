package com.company;

import java.util.Scanner;

public class Square {
    public int side;

    public void areaSquare()
    {
        Scanner scan = new Scanner(System.in);
        int side = scan.nextInt();
        System.out.println("area of square:" + side*side);
    }

    public void perimeterSquare()
    {
        Scanner scan = new Scanner(System.in);
        int side = scan.nextInt();
        System.out.println("perimeter of square:" + side*4);
    }
}
