package ownException;

public class FactorialException extends Exception {

    private int number;

    public int getNumber() {
        return number;
    }

    public FactorialException(String message, int num) { // конструктор

        super(message);
        number = num;
    }
}
//Чтобы создать свой класс исключений, надо унаследовать его от класса Exception.
//Например, у нас есть класс, вычисляющий факториал, и нам надо выбрасывать специальное исключение,
//если число, передаваемое в метод, меньше 1.

//Здесь для определения ошибки, связанной с вычислением факториала, определен класс FactorialException,
//который наследуется от Exception и который содержит всю информацию о вычислении.

//В конструкторе FactorialException в конструктор базового класса Exception передается сообщение об ошибке:
//super(message). Кроме того, отдельное поле предназначено для хранения числа, факториал которого вычисляется.