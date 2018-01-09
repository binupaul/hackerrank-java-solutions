package hackerrank;

import java.util.Scanner;

public class BreakingTheRecords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numRecords = in.nextInt();
        int[] scores = new int[numRecords];
        
        for (int i = 0; i < numRecords; i++) {
            scores[i] =  in.nextInt();
        }
        in.close();
        
        int min = scores[0];
        int max = scores[0];
        
        int minDecreaseCount = 0;
        int maxIncreaseCount = 0;
        for (int i = 1; i < numRecords; i++) {
            if (scores[i] > max) {
                max = scores[i];
                maxIncreaseCount++;
            }
            
            if (scores[i] < min) {
                min = scores[i];
                minDecreaseCount++;
            }
        }
        
        System.out.println(maxIncreaseCount + " " + minDecreaseCount);
    }
}
