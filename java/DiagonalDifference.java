package hackerrank;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int d1Counter = 0;
        int d2Counter = n - 1;
        int d1Sum = 0;
        int d2Sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int current = s.nextInt();
                if (j == d1Counter) {
                    d1Sum += current;
                }
                if (j == d2Counter) {
                    d2Sum += current;
                }
            }
            d1Counter++;
            d2Counter--;
        }
        s.close();
        System.out.print(Math.abs(d1Sum - d2Sum));
    }
}
