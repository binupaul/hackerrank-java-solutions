package hackerrank;

import java.util.Scanner;

public class CountingSortFull {
    public static void main(String[] args) {

        int[] counts = new int[100]; // frequency count
        int[] cumulative = new int[100]; // cumulative count

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // total number of values

        int[] values = new int[n]; // the actual int values read
        String[] strValues = new String[n]; // the actual string values read

        // read in the values, at the same time,
        // set the frequency count

        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            String str = in.next();

            values[i] = val;
            strValues[i] = (i < n / 2) ? "-" : str;
            counts[val]++;
        }

        // compute the cumulative count

        int total = counts[0];
        cumulative[0] = total;
        for (int i = 1; i < 100; i++) {
            total = total + counts[i];
            cumulative[i] = total;
        }

        // do the actual sort
        String[] sortedStrs = new String[n];

        for (int i = values.length - 1; i >= 0; i--) {
            sortedStrs[cumulative[values[i]] - 1] = strValues[i];
            cumulative[values[i]]--;
        }

        // print
        for (int i = 0; i < sortedStrs.length; i++) {
            System.out.print(sortedStrs[i] + " ");
        }
        in.close();
    }
}
