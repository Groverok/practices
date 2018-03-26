package operators;

/**
 * Created by SergeyZhilinsky on 3/1/2018.
 */
//Логические операторы
public class Test4 {
    public static void main(String args[]) {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b = " + (a && b));

        System.out.println("a || b = " + (a || b));

        System.out.println("!(a && b) = " + !(a && b));
    }
}
