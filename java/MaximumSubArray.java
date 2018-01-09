package hackerrank;

import java.util.Scanner;

public class MaximumSubArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int size = in.nextInt();
            int arr[] = new int[size];

            for (int j = 0; j < size; j++) {
                arr[j] = in.nextInt();
            }
            printResults(arr);
        }
        in.close();
    }

    private static void printResults(int[] arr) {
        int maxForThisElement = arr[0];
        int maxTillNow = arr[0];
        int sumOfPositives = arr[0] < 0 ? 0 : arr[0];
        boolean allNegative = arr[0] < 0;
        int minNegative = arr[0] < 0 ? arr[0] : 0;

        for (int i = 1; i < arr.length; i++) {
            maxForThisElement = java.lang.Math.max(arr[i], maxForThisElement + arr[i]);
            maxTillNow = java.lang.Math.max(maxTillNow, maxForThisElement);

            if (arr[i] > 0) {
                sumOfPositives += arr[i];
            }

            allNegative = allNegative && (arr[i] < 0);
            if (arr[i] < 0) {
                minNegative = java.lang.Math.max(minNegative, arr[i]);
            }
        }
        System.out.println(maxTillNow + " " + (allNegative ? minNegative : sumOfPositives));
    }
}
