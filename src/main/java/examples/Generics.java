package examples;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SergeyZhilinsky on 2/21/2018.
 */
public class Generics {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        words.add("Hello ");
        words.add("world!");
        String s = words.get(0) + words.get(1);
        System.out.println(s.equals("Hello world!"));
    }
}

//Это пример, собственно, с Generiсs. Тут представлен список строк, в который мы добавляем две произвольные строки.
//В данном случае обобщенным типом является класс ArrayList (вместо этого T мы можем подставить любой тип,
//который не является примитивным типом).