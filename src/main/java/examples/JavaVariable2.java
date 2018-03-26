package examples;
/**
 * Created by SergeyZhilinsky on 2/19/2018.
 */
public class JavaVariable2 {  // What is a Instance Variable in java? Instance Variable is declared parallel to method or constructor in class.

    int sum;  //Instance Variable.    // It is visible for all methods and constructors of that class.

    public void Calc() {
        // Local Variables.
        int item1 = 5;
        int item2 = 7;
        sum = item1 + item2;
        System.out.println("Sum is : " + sum);
    }

    public static void main(String args[]) {
        JavaVariable j = new JavaVariable();
        j.Calc();
    }
}