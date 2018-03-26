package ownException;

public class Test {
    public static void main(String[] args) {

        try {
            int result = Factorial.getFactorial(6);
            System.out.println(result);
        } catch (FactorialException ex) {

            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
    }
}
// Например, у нас есть класс, вычисляющий факториал, и нам надо выбрасывать специальное исключение,
// если число, передаваемое в метод, меньше 1.