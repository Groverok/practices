package other;

/**
 * Created by SergeyZhilinsky on 2/27/2018.
 */
public class Equals {
    public static void main(String[] args) {
        //boolean equals (Object o)
        String s = "cat";
        boolean test1 = s.equals("cat");//true
        boolean test2 = s.equals("Cat");//false
        boolean test3 = s.equals("c" + "a" + "t");//true

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
    }
}
//Как правильно сравнить две строки в Java?
//Метод equals проверяет – совпадают ли строки.

//        Как правильно сравнить две строки в Java игнорируя регистр букв?
//        Метод equalsIgnoreCase – совпадают ли строки, игнорируя регистр букв.

//        boolean equalsIgnoreCase (String str)
//        String s = "cat";
//        boolean test1 = s.equalsIgnoreCase("cat");//true
//        boolean test2 = s.equalsIgnoreCase("Cat");//true
//        boolean test3 = s.equalsIgnoreCase("cAT");//true

//        Как отсортировать список строк в алфавитном порядке?
//        Используя метод Collections.sort().

//        ArrayList<String> list = new ArrayList<>();
//        list.add("zas");
//        list.add("fas");
//        list.add("sd");
//        list.add("asdg");
//        Collections.sort(list);

//        Как развернуть строку задом наперед?
//        String s = "Bender";
//        StringBuilder s2 = new StringBuilder(s);
//        s2.reverse(); //будет "redneB";