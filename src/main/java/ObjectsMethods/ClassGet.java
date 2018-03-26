package ObjectsMethods;

import java.util.GregorianCalendar;

public class ClassGet {
    // getClass() – возвращает ссылку на метаобъект типа класс.
    // С его помощью можно получать информацию о классе, к которому принадлежит объект
    // или Метод , возвращающий класс объекта (не переопределяется)

    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.getTime());
        System.out.println(cal.getClass());

        Integer i = new Integer(5);
        System.out.println(i);
        System.out.println(i.getClass());
    }
}


