package EpamTasks;

public class hhz {

    private static void printArray(int[] arr) { // print horizontal

        for (int i = 0; i < arr.length; i++) {
            System.out.print(", ");
            if ((i % 3 == 1) && (i % 5 == 3)) {
                System.out.println("moto_car");
            } else if (i == 3) {
                System.out.println("moto");
            } else if (i == 5)
                System.out.println("car");

            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 5, 15, 18};
        printArray(arr);

    }
}