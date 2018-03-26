package other;

/**
 * Created by SergeyZhilinsky on 2/20/2018.
 */
public class FibonacciSeries {
    public static void main(String args[]) {
        int x1 = 0, x2 = 1, x3, i, cnt = 15;
        // To print 0 and 1
        System.out.print(x1 + " " + x2);

        // loop starts from 2 as 0 and 1 are already printed.
        for (i = 2; i < cnt; ++i) {
            x3 = x1 + x2;
            System.out.print(" " + x3);
            x1 = x2;
            x2 = x3;
        }
    }
}
