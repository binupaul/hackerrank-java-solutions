package hackerrank;

import java.util.Scanner;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int heights[] = new int[n];

        heights[0] = in.nextInt();
        int max = heights[0];

        for (int i = 1; i < n; i++) {
            heights[i] = in.nextInt();
            if (heights[i] > max) {
                max = heights[i];
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (heights[i] == max) {
                count++;
            }
        }
        System.out.print(count);
        in.close();
    }
}
