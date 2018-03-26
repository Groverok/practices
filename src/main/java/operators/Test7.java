package operators;

/**
 * Created by SergeyZhilinsky on 3/1/2018.
 */

//Оператор instanceof — проверяет, является ли объект определенного типа (типа класса или типа интерфейса) и используется только для переменных ссылочного объекта.
public class Test7 {
    public static void main(String args[]) {
        String name = "Олег";
        // Следующее вернётся верно, поскольку тип String
        boolean result = name instanceof String;
        System.out.println(result);
    }
}