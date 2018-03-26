package EpamTasks;

public class numbers {
    public static void main(String[] args) {

        for (int i = 1; i < 21; i++) {
            // if the number is divisible by 5 and 3, write "FizzBuzz"
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}