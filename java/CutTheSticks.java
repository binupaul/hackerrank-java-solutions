package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class CutTheSticks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] sizes = new int[n];
        for (int i = 0; i < n; i++) {
            sizes[i] = in.nextInt();
        }
        in.close();

        Arrays.sort(sizes);

        int currPointer = 0;
        while (currPointer < sizes.length) {
            System.out.println(sizes.length - currPointer);

            while ((currPointer < sizes.length - 1) && sizes[currPointer] == sizes[currPointer + 1]) {
                currPointer++;
            }
            currPointer++;
        }
    }
}
