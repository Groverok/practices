package other;

/**
 * Created by SergeyZhilinsky on 2/28/2018.
 */
public class Equals3 {

    public static void main(String[] args) {

        Integer a = new Integer(6);
        Integer b = new Integer(6);

        System.out.println(a == b);       // false т.к. это разные объекты с разными ссылками - в разной частях памяти компа
        System.out.println(a.equals(b));  // true, здесь уже задействована логика сравнения

//        String hashCode = a.toString();
//        System.out.println(hashCode);
    }
}