package ObjectsMethods;

/**
 * Created by SergeyZhilinsky on 2/20/2018.
 */

public class HashCode {
    public static void main(String[] args) {
        // Метод вычисления хэш-кода объекта - internal address of object
        Object object = new Object();
        int hCode;
        hCode = object.hashCode();
        System.out.println(hCode);

        // 10-ти значное число. Это число и есть наша битовая строка фиксированной длины. (1160460865)
        // В java она представлена в виде числа примитивного типа int, который равен 4-м байтам,
        // и может помещать числа от -2 147 483 648 до 2 147 483 647.
        // если два объекта «равны» (метод equals возвращает true),то и хэш-коды этих объектов равны. Но не наоборот
        // Эта функция возвращает хеш-код полученный путем конвертации внутреннего адреса объекта в число,
        // что ведет к созданию уникального кода для каждого отдельного объекта.
    }
}