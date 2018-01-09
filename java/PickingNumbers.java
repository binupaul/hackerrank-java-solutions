package hackerrank;

import java.util.Scanner;

public class PickingNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] counts = new int[100];
        
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int val = s.nextInt();
            counts[val]++;
        }
        s.close();
        
        int max = 0;
        for (int i = 1; i < 100; i++) {
            int leftCount = 0;
            int rightCount = 0;
            if (i == 1) {
                rightCount = counts[i + 1];
            } else if (i == 99) {
                leftCount = counts[i - 1];
            } else {
                rightCount = counts[i + 1];
                leftCount = counts[i - 1];
            }
            int countForThisIdx = counts[i] + Math.max(leftCount, rightCount);
            if (countForThisIdx > max) {
                max = countForThisIdx;
            }
        }
        System.out.println(max);
    }
}
