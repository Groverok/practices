package EpamTasks;

public class Array {

    private static void printArray(int[] arr) { // print horizontal
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                System.out.print(", ");
                System.out.print("moto ");
            }
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 5, 15, 18};
        printArray(arr);

    }
}