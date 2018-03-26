package examples;

public class Fibonacci2 {
    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;
        int sum = 0;
        for (int i = 0; i <= 21;) {
            System.out.println(f1);
            sum = i + f2;
            f2 = i;
            f1 = sum;
            i = f1;
        }
    }
}
