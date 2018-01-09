package hackerrank;

import java.util.Scanner;

public class Kangaroo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        // X2 is always greater than X1 as per
        // problem statement

        if (v2 >= v1) {
            System.out.print("NO");
        } else {
            // the number of jumps = (x2 - x1)/(v1 - v2) should be positive and
            // an integer
            // x2 - x1 is positive, hence v1 - v2 should be positive
            // i.e. v1 > v2
            if (v1 > v2 && ((x2 - x1) % (v1 - v2) == 0)) {
                System.out.print("YES");
            } else {
                System.out.print("NO");
            }
        }

        in.close();
    }
}
