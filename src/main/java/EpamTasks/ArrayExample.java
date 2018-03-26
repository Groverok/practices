package EpamTasks;

public class ArrayExample {
    private static void printArray(int[] anArray) {
        for (int i = 0; i < anArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(anArray[i]);
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,3,8,5,15,18};
        printArray(arr);
    }
}

// input example: int [] arr = {1,3,8,5,15,18}
// any number divisible by three is replaced by the word 'moto' and
// any divisible by five by the word 'car'. Numbers divisible by both become 'motocar'.
// returned output: {1, "moto", 8, "car", "motocar", "moto"}