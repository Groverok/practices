package other;

/**
 * Created by SergeyZhilinsky on 2/19/2018.
 */
public class JavaVariable3 {  //What is a Class Variable in java?


    //Class Variable
    static String sumType = "Basket"; //Class variable is declared with static keyword in class parallel to methods and constructor.
                                      //Class variable is initialized only once at the start of execution and destroyed on end of program. Class variable is also known as static variable.
    //Instance Variable.
    int sum;

    public void Calc() {

        int item1 = 5;  // Local Variables.
        int item2 = 7;
        sum = item1 + item2;
        System.out.println(sumType + " Sum is : " + sum);
    }

    public static void main(String args[]) {
        JavaVariable j = new JavaVariable();
        j.Calc();
    }
}
//        What is the difference between instance variable and class variable?
//        Answer :
//
//        Instance Variable :
//        It is unique to each instance of the class.
//        Declared without static modifier.
//        Memory allocation, loading and initialization is done at run time.

//        Static Variable :
//        It is shared by all instances of the class.
//        Declared with static modifier.
//        Memory allocation is done at compile time, loaded at load time and they are initialized at class initialization time.