package collections;

import java.util.LinkedList;

//https://habrahabr.ru/post/127864/
//Операции доступа по индексу производятся перебором с начала или конца (смотря что ближе) до нужного элемента.
//LinkedList - двунаправленный связанный список на основе элементов и связи между ними.
//Операции вставки и удаления в середине списка работают у него эффективнее.
//В качестве LinkedList лучше всего подходит представление вагонов поезда сцепленных последовательно.
//Тут уже не используется массив, а набор данных с двумя указателями на следующий и предыдущий объект.
public class LinkedListClassExample {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();  //Только что созданный объект list, содержит свойства header и size.
        list.add("Item1");
        list.add("Item5");
        list.add("Item3");
        list.add("Item6");
        list.add("Item2");
        System.out.println("Linked List Content: " + list);

        /*Add First and Last Element*/
        list.addFirst("First Element");
        list.addLast("Last Element");
        System.out.println("LinkedList Content after addition: " + list);

        /*This is how to get and set Values*/
        Object firstVar = list.get(0); // первый в списке
        System.out.println("First element: " + firstVar);

        list.set(0, "Changed first item"); // устанавливаем элемент
        Object firstVar2 = list.get(0);
        System.out.println("First element after update by set method: " + firstVar2);

        /*Remove first and last element*/
        list.removeFirst();
        list.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " + list);

        /* Add to a Position and remove from a position*/
        list.add(0, "Newly added item");
        list.remove(2);
        System.out.println("Final Content: " + list);
    }
}
// Для добавления элемента в конец списка используется метод add(), для удаления используется метод remove().
// LinkedList — реализует интерфейс List. Является представителем двунаправленного списка !!!,
// где каждый элемент структуры содержит указатели на предыдущий и следующий элементы.
// Итератор поддерживает обход в обе стороны.
// Реализует методы получения, удаления и вставки в начало, середину и конец списка.
// Позволяет добавлять любые элементы в том числе и null.
//В LinkedList вставка осуществляется так: находится элемент, за которым должен следовать вставляемый элемент,
// изменяются ссылки в нем и следующим за ним.