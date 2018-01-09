package hackerrank;

import java.util.Scanner;

public class CountingSortPartTwo {
    public static void main(String[] args) {
        int[] counts = new int[100];

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            counts[val]++;
        }
        in.close();

        for (int i = 0; i < counts.length; i++) {
            print(i, counts[i]);
        }
    }

    private static void print(int val, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(val);
            System.out.print(" ");
        }
    }
}
