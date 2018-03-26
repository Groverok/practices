package examples;

public class Variables {

    //Class Variable - with keyword static
    static String sumType = "Basket";
    //Instance Variable.
    int sum;

    public void Calc() {
        // Local Variables.
        int item1 = 5;
        int item2 = 7;
        sum = item1 + item2;
        System.out.println(sumType + " Sum is : " + sum);
    }

    public static void main(String args[]) {
        Variables j = new Variables();
        j.Calc();
    }
}