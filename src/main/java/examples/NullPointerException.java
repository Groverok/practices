package examples;

public class NullPointerException extends Throwable {
        public static void main(String args[])
        {
            String str = null;
            System.out.println (str.length());
        }
    }
