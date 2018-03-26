package EpamTasks;

public class Arr {
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 5, 15, 18};

        for (int x = 0; x < arr.length; x++)

            // if the number is divisible by 5 and 3, write "FizzBuzz
            if (x % 3 == 1 && x % 5 == 1) {
                System.out.println("moto_car");

            } else if (x % 3 == 1) {
                System.out.println("moto");
            } else if (x % 5 == 1)
                System.out.println("car");

        //System.out.println(arr);
    }
}