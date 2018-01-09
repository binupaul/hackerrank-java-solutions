package hackerrank;

import java.util.Scanner;

public class CountingSortPartThree {
    public static void main(String[] args) {
        int[] counts = new int[100];
        int[] cumulative = new int[100];

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            @SuppressWarnings("unused")
            String str = in.next();
            counts[val]++;
        }

        int total = counts[0];
        cumulative[0] = total;
        for (int i = 1; i < 100; i++) {
            total = total + counts[i];
            cumulative[i] = total;
        }

        for (int i = 0; i < 100; i++) {
            System.out.print(cumulative[i] + " ");
        }
        in.close();
    }
}
