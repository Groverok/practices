package collections;

import java.util.Hashtable;

public class Hash {
    public static void main(String[] args) {
        //Created hashtable class object to use Its different properties.
        //По умолчанию при использовании пустого конструктора создается картотека ёмкостью из 16 ячеек (0-15)
        //Вы можете указать свои ёмкость и коэффициент загрузки, используя конструкторы HashMap(capacity)
        // и HashMap(capacity, loadFactor). Максимальная ёмкость, которую вы сможете установить,
        // равна половине максимального значения int (1073741824).
        //Добавление элементов происходит при помощи метода put(K key, V value)- Вам надо указать ключ и его значение

        //Массив хранит - table — Массив типа Entry[], который является хранилищем ссылок на списки (цепочки) значений;
        //loadFactor — Коэффициент загрузки. Значение по умолчанию 0.75 является хорошим компромиссом между временем доступа и объемом хранимых данных;
        //threshold — Предельное количество элементов, при достижении которого, размер хэш-таблицы увеличивается вдвое. Рассчитывается по формуле (capacity * loadFactor);
        //size — Количество элементов HashMap- - capacity - по умолчанию имеет значение 16,  t1.size(); - узнать размер

        Hashtable<String, Integer> t1 = new Hashtable<String, Integer>();
        t1.put("Legs", 4); //Store value 4 In key = Legs добавление элементов
        t1.put("Eyes", 2);  //Store value 2 In key = Eyes
        t1.put("Mouth", 1); //Store value 1 In key = Mouth

        //Accessing hash table values using keys.
        System.out.println("Animal Legs = " + t1.get("Legs"));
        System.out.println("Animal Eyes = " + t1.get("Eyes"));
        System.out.println("Animal Mouth = " + t1.get("Mouth"));
    }
}
// Hashtable - provides us a structure to store key and its value as a pair In table format.
// Means we can store value with Its key and can access that value using Its key.
// There Is not any Index of value In Hashtable.
