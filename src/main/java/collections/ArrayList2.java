package collections;

import java.util.ArrayList;

//http://java-online.ru/java-arrayList.xhtml
// ArrayList следует использовать, когда в приоритете доступ по индексу, так как эти операции выполняются за константное время
// ArrayList основан на обычном массиве. Данная коллекция динамически увеличивает размер массива, если в нем нехватает места
// Вставлять созданные объекты методом add().
// Обращение к элементам массива осуществляется с помощью метода get().

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();   // создали объект - содержит свойства elementData и size.
        list.add("Школа");
        System.out.println("Первый элемент массива '" + list.get(0) + "'");
        System.out.println("Размер массива = " + Integer.valueOf(list.size()));
    }
}
// Замена элемента массива ArrayList, метод set с указанием индекса и новым значением. list.set(1, "Персик");
// Удаление элемента массива ArrayList, метод remove - Можно удалять по индексу или по объекту
// Существует метод indexOf(), который ищет нужный элемент и возвращает его индекс.