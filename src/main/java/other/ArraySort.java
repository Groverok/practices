package other;

import java.util.Arrays;

/**
 * Created by SergeyZhilinsky on 2/27/2018.
 */
    //Сортировка массива при помощи метода sort() из класса Arrays.
    //Сортировка массива целых чисел по возрастанию
public class ArraySort {
    public static void main(String[] args) {
        //Создаем массив случайных чисел
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nSorted: \n");
        //Сортируем массив
        Arrays.sort(arr);
        //Выводим отсортированный массив на консоль.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
