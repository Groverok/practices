package Selenium;

import java.util.Scanner;

public class Swapping {

    public static void main(String[] args) {
        // Write a java program for swapping of two numbers ? (обмен чисел)
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a = in.nextInt();
        System.out.println("Enter the 2nd number");
        int b = in.nextInt();
        System.out.println("Before swapping a = " + a + " and b = " + b);
        int x = a;
        a = b;
        b = x;
        System.out.println("After swapping a = " + a + " and b = " + b);
    }
}