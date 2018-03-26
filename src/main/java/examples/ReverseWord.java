package examples;

public class ReverseWord { // переворот слова

    public static void main(String[] args) {
        String s = "Привет !";
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.substring(i, i + 1);
        }
        System.out.println(result);
    }
}