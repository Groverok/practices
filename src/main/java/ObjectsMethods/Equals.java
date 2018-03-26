package ObjectsMethods;

public class Equals {
    public static void main(String args[]) {
        //Метод сравнения двух объектов(должен быть переопределен)
        String Str1 = "Добро пожаловать на ProgLang.su";
        String Str2 = Str1;
        String Str3 = new String("Сайт для изучения программирования");
        boolean retVal;

        retVal = Str1.equals(Str2);
        System.out.println("Строка Str1 равна строке Str2? Ответ: " + retVal);

        retVal = Str1.equals(Str3);
        System.out.println("Строка Str1 равна строке Str3? Ответ: " + retVal);
    }
}
