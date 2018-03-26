package IO;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

public class StringReader {
    public StringReader(Object test) {

    }
    //Код в лекции для примера «Чтение из объекта reader и запись в объект writer

    public static void main(String[] args) throws Exception {
        //эту строку должен будет прочитать Reader
        String test = "Hi!\n My name is Richard\n I'm a photographer\n";
        //заворачиваем строку в StringReader
        StringReader reader = new StringReader(test);

        //Создаем объект StringWriter
        StringWriter writer = new StringWriter();

        //переписываем строки из Reader во Writer, предварительно развернув их
        //executor(reader, writer);

        //получаем текст, который был записан во Writer
        String result = writer.toString();

        //выводем полученный из Writer’а текст на экран
        System.out.println("Результат: " + result);
    }

    public static void executor(Reader reader, Writer writer) throws Exception {
        BufferedReader br = new BufferedReader(reader);
        while (br.ready()) {
            //читаем строку из Reader’а
            String line = br.readLine();

            //разворачиваем строку задом наперед
            StringBuilder sb = new StringBuilder(line);
            String newLine = sb.reverse().toString();

            //пишем строку в Writer
            writer.write(newLine);
        }
    }
}