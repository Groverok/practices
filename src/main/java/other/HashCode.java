package other;

/**
 * Created by SergeyZhilinsky on 2/20/2018.
 */

public class HashCode {
    public static void main(String[] args) {
        Object object = new Object();
        int hCode;
        hCode = object.hashCode();
        System.out.println(hCode);

        // 10-ти значное число. Это число и есть наша битовая строка фиксированной длины.
        // В java она представлена в виде числа примитивного типа int, который равен 4-м байтам, и может помещать числа от -2 147 483 648 до 2 147 483 647.
    }
}