package hackerrank;

import java.util.Scanner;

public class SherlockAndArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numCases = s.nextInt();
        for (int i = 0; i < numCases; i++) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = s.nextInt();
            }
            System.out.println(checkCondition(arr, n) ? "YES" : "NO");
        }
        s.close();
    }
    
    private static boolean checkCondition(int[] arr, int n) {
        int[] leftSums = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            leftSums[i] = sum;
            sum += arr[i];
        }
        
        int[] rightSums = new int[n];
        sum = 0;
        for (int j = n - 1; j >= 0; j--) {
            rightSums[j] = sum;
            sum += arr[j];
        }
        
        for (int k = 0; k < n; k++) {
            if (leftSums[k] == rightSums[k]) {
                return true;
            }
        }
        return false;
    }
}
