package hackerrank;

import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // read in first set of numbers (where some numbers are missing)
        int n = s.nextInt();
        int[] missedArr = new int[n];
        for (int i = 0; i < n; i++) {
            missedArr[i] = s.nextInt();
        }
        
        // read in second set of numbers (where all numbers are present)
        int m = s.nextInt();
        int[] originalArr = new int[m];
        for (int i = 0; i < m; i++) {
            originalArr[i] = s.nextInt();
        }
        s.close();
        
        // find the minimum value
        int min = originalArr[0];
        for (int i = 1; i < m; i++) {
            if (originalArr[i] < min) {
                min = originalArr[i];
            }
        }
        
        // map the original numbers
        int originalCounts[] = new int[101];
        for (int i = 0; i < m; i++) {
            originalCounts[originalArr[i] - min]++;
        }
        
        // map the numbers (where some numbers are missing)
        int missedCounts[] = new int[101];
        for (int i = 0; i < n; i++) {
            missedCounts[missedArr[i] - min]++;
        }
        
        // print out the missing numbers
        for (int i = 0; i < 101; i++) {
            if (originalCounts[i] != missedCounts[i]) {
                System.out.print(i + min);
                System.out.print(' ');
            }
        }
    }
}
