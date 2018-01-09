package hackerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] numbers = new String[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.next();
        }
        in.close();

        Arrays.sort(numbers, new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {

                if (s1.length() == s2.length()) {
                    if (s1.equals(s2)) {
                        return 0;
                    } else {
                        return s1.compareTo(s2);
                    }
                } else if (s1.length() > s2.length()) {
                    return 1;
                } else {
                    return -1;
                }
            }

        });

        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }
    }
}
