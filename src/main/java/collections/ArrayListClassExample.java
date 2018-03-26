package collections;

import java.util.ArrayList;
import java.util.Iterator;

// ArrayList - автоматически расширяемый массив. Вы можете работать с массивом,
// но при этом не используются квадратные скобки.(square brackets.)
// Можно без проблем добавлять новые элементы, в том числе и в середину листа.
// ArrayList может менять свой размер во время исполнения программы,
// при этом не обязательно указывать размерность при создании объекта.
// А также спокойно удалить элемент из любого места
// Элементы ArrayList могут быть абсолютно любых типов в том числе и null.
//ArrayList следует использовать, когда в приоритете доступ по индексу

public class ArrayListClassExample {
    public static void main(String[] args) {
        // Create array list.
        ArrayList<String> a = new ArrayList<String>();
        // Add elements in array list.
        a.add("one");
        a.add("two");
        a.add("three");
        a.add("four");
        a.add("one");
        a.add("six");
        a.add("seven");
        a.add("eight");

        //Iterating over the array list elements.
        Iterator itr = a.iterator();
        System.out.println("ArrayList items are : ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //Add item at specified index.
        a.add(5, "nine");
        System.out.println("Now ArrayList items are : " + a);

        //Get item from specified index.
        System.out.println("Item at index 6 is : " + a.get(6));

        //Remove item from array list.
        a.remove("three");
        System.out.println("Now ArrayList items are : " + a);

        //Get index of element from array list.
        System.out.println("Index of one is : " + a.indexOf("one"));

        //Get last index of element from array list.
        System.out.println("Last Index of one is : " + a.lastIndexOf("one"));
    }
}
// ArrayList представляет простой список, аналогичный массиву, за тем исключением,
// что количество элементов в нем не фиксировано.
// ArrayList - автоматически расширяемый массив. - ArrayList — реализует интерфейс List
// Массивы имеют фиксированную длину, и после того как массив создан,
// он не может расти или уменьшаться. ArrayList может менять свой размер во время исполнения программы,
// при этом не обязательно указывать размерность при создании объекта.
// Кроме того, вы без проблем можете вставить новый элемент в середину коллекции.
// А также спокойно удалить элемент из любого места. Элементы ArrayList могут быть абсолютно любых типов
// в том числе и null

//Емкость в ArrayList представляет размер массива, который будет использоваться для хранения объектов.
// При добавлении элементов фактически происходит перераспределение памяти - создание нового массива
// и копирование в него элементов из старого массива.