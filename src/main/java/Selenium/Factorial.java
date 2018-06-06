package Selenium;

import java.util.Scanner;

public class Factorial {

    public static void main(String args[]) {
        // Write a java program for factorial of a given number.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the num for which you want the factorial");
        int num = in.nextInt();
        for (int i = num - 1; i > 0; i--) {
            num = num * i;
        }
        System.out.println(num);

    }
}