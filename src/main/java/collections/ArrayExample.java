package collections;

public class ArrayExample {
    public static void main(String[] args) {

        // Массив = хранит элементы данных на основе последовательного индекса, чаще всего с нулевой базой.
        int a[] = new int[6]; //Array declaration and Creation. 6 is length of array.
        a[0] = 10;            //initialize 1st array element
        a[1] = 12;
        a[2] = 48;
        a[3] = 17;
        a[4] = 5;
        a[5] = 49;      //initialize 6th array element

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
