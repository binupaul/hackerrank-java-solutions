package hackerrank;

import java.util.Scanner;

public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] birdStats = new int[5];

        for (int i = 0; i < n; i++) {
            int birdType = in.nextInt();
            birdStats[birdType - 1]++;
        }

        int maxCount = 0;
        int typeWithMaxCount = 0;
        for (int i = 0; i < birdStats.length; i++) {
            if (birdStats[i] > maxCount) {
                maxCount = birdStats[i];
                typeWithMaxCount = i + 1;
            }
        }

        System.out.print(typeWithMaxCount);
        in.close();
    }
}
