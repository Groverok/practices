package examples;

import java.util.Scanner;

public class InputMyName {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //ввести имя в консоли
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Ваше имя: " + name);
    }
}
