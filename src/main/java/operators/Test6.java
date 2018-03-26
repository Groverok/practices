package operators;

/**
 * Created by SergeyZhilinsky on 3/1/2018.
 */
//Тернарный оператор — оператор, который состоит из трех операндов и используется для оценки выражений типа boolean.
// Тернарный оператор в Java также известен как условный оператор.
public class Test6 {
    public static void main(String args[]) {
        int a, b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println("Значение b: " + b);

        b = (a == 10) ? 20 : 30;
        System.out.println("Значение b: " + b);
    }
}
