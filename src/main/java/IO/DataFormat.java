package IO;

import java.text.SimpleDateFormat;
import java.util.Date;

// Как переопределить метод toString в Java:
// Как распечатать Date в формате ddMMyy в Java

public class DataFormat {
    public static void main(String[] args) {

        String pattern = "dd - MM - yyyy";

        SimpleDateFormat dataFormat = new SimpleDateFormat(pattern);
        String date = dataFormat.format(new Date());
        System.out.println(date);
    }
}