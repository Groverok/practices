package examples;
/**
 * Created by SergeyZhilinsky on 2/19/2018.
 */
public class JavaVariable {

    //What is a Instance Variable in java?
    public void Calc() {
        int sum;               // Local Variables. - Local variable is declared inside method (Calc) or constructor and it is limited for that method or constructor only.
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