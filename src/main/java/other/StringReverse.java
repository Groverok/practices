package other;

/**
 * Created by SergeyZhilinsky on 2/19/2018.
 */
public class StringReverse {
    public static void main(String[] args) {
        //String to reverse.
        String str = "This Is String.";
        String revString = "";

        for (int i = str.length() - 1; i >= 0; --i) {
            //Start getting characters from end of the string.
            revString += str.charAt(i);
        }

        System.out.println(revString);
    }
}
