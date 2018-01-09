package hackerrank;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int posTotal = 0;
        int negTotal = 0;
        int zeroesTotal = 0;

        for (int i = 0; i < n; i++) {
            int current = s.nextInt();
            if (current > 0) {
                posTotal++;
            } else if (current < 0) {
                negTotal++;
            } else {
                zeroesTotal++;
            }
        }
        s.close();
        System.out.print(((float) posTotal) / n);
        System.out.println();
        System.out.print(((float) negTotal) / n);
        System.out.println();
        System.out.print(((float) zeroesTotal) / n);
    }
}
