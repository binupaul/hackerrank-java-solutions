package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] vals = new int[n];

        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            vals[i] = val;
        }

        in.close();
        Arrays.sort(vals);

        // find the minimum difference
        int mindiff = vals[1] - vals[0];
        for (int i = 1; i < vals.length - 1; i++) {
            int currentdiff = vals[i + 1] - vals[i];
            if (currentdiff < mindiff) {
                mindiff = currentdiff;
            }
        }

        // print out the pairs having the minimum difference
        for (int i = 0; i < n - 1; i++) {
            if (vals[i + 1] - vals[i] == mindiff) {
                System.out.print(vals[i] + " " + vals[i + 1] + " ");
            }
        }
    }
}
