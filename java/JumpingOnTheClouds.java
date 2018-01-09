package hackerrank;

import java.util.Scanner;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] type = new int[n];
        for (int i = 0; i < n; i++) {
            type[i] = in.nextInt();
        }
        in.close();
        
        int currPtr = 0;
        int totalHops = 0;
        while (currPtr != n - 1) {
            if ((currPtr + 2 < n) && (type[currPtr + 2] == 0)) {
                currPtr = currPtr + 2;
            } else {
                currPtr = currPtr + 1;
            }
            totalHops = totalHops + 1;
        }
        System.out.println(totalHops);
    }
}
