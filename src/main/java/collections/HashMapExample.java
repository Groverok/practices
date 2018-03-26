package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//про HashMap важно сказать, что для работы с HashMap надо переопределять методы equals(Object obj) и hashCode();
//«Как работает HashMap?», я просто отвечу: «По принципам Хеширования». Проще некуда.
//Хеширование в простейшем представлении, это – способ преобразования любой переменной/объекта
// в уникальный код после применения любой формулы/алгоритма к их свойствам
//Хеш-функция должна возвращать одинаковый хеш-код всякий раз, когда она применена к одинаковым или равным объектам.
//Другими словами, два одинаковых объекта должны возвращать одинаковые хеш-коды по очереди.
//Хеш-код для ключей со значением null это всегда 0.

public class HashMapExample {
    public static void main(String[] args) {
        // create Map
        Map<Integer, String> m = new HashMap<Integer, String>();  // K - это Key (ключ), V - Value (значение)
        // Add key with value in map.
        m.put(3, "Chicago"); //Добавление элементов происходит при помощи метода put(K key, V value). Вам надо указать ключ и его значение.
        m.put(7, "Mumbai");
        m.put(1, "Tokyo");
        m.put(5, "Delhi");
        m.put(2, "Paris");
        m.put(8, "Beijing");
        m.put(11, "Berlin");

        //Print map
        System.out.println("Map : " + m);
        // Get size of map.
        System.out.println("Map size is : " + m.size());

        //Check if map is empty.
        System.out.println("Map is empty? : " + m.isEmpty());

        //Remove mapping from map.
        m.remove(3);
        System.out.println("Map value after removing mapping of key 3 : " + m);

        //Get value from map for specified key.
        System.out.println("Value for key 5 is : " + m.get(5));

        //Iterating over map.
        Iterator<Integer> keySetIterator = m.keySet().iterator();
        while (keySetIterator.hasNext()) {
            Integer key = keySetIterator.next();
            System.out.println("key: " + key + " value: " + m.get(key));
        }

        //Check if map contains specified key.
        System.out.println("Map has key 7 ? : " + m.containsKey(7));

        //Check if map contains specified value.
        System.out.println("Map has value twenty ? : " + m.containsValue("Ahmedabad"));
    }
}

//Карта(map) по определению, это – «Объект хранящий попарно значения(values) и ключи(keys)»
//Как работает HashMap?» - «По принципам Хеширования».
// Хеширование в простейшем представлении, это – способ преобразования любой переменной/объекта
// в уникальный код после применения любой формулы/алгоритма к их свойствам.
//Хеш-функция должна возвращать одинаковый хеш-код всякий раз, когда она применена к одинаковым или равным объектам.
//Другими словами, два одинаковых объекта должны возвращать одинаковые хеш-коды по очереди.
//По умолчанию при использовании пустого конструктора создается картотека ёмкостью из 16 ячеек.
// При необходимости ёмкость увеличивается, вам не надо об этом задумываться.

//Примечание: Все объекты в java наследуют стандартную реализацию hashCode() функции,
// описанной в классе Object. Эта функция возвращает хеш-код полученный путем
// конвертации внутреннего адреса объекта в число, что ведет к созданию уникального кода
// для каждого отдельного объекта.

//метод put() = * Связывает определенное значение с определенным ключом в этой карте(map).
//* Если карта перед этим содержала значение для данного ключа, это значение
//* заменится на новое.

//Класс HashMap использует хеш-таблицу для хранения карточки, обеспечивая быстрое время выполнения запросов get()
// и put() при больших наборах. Класс реализует интерфейс Map (хранение данных в виде пар ключ/значение).
// Ключи и значения могут быть любых типов, в том числе и null. При этом все ключи обязательно должны быть
// уникальны, а значения могут повторяться. Данная реализация не гарантирует порядка элементов.