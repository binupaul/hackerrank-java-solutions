package hackerrank;

import java.util.Scanner;

public class CountingValleys {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();

        int prev = 0;
        int current = 0;
        boolean descent = false;
        int totalValleys = 0;

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (c == 'D') {
                prev = current;
                current = current - 1;
            } else if (c == 'U') {
                prev = current;
                current = current + 1;
            }

            if (prev == 0 && current == -1) {
                descent = true;
            }

            if (descent && prev == -1 && current == 0) {
                totalValleys++;
                descent = false;
            }
        }

        System.out.print(totalValleys);
        in.close();
    }

}
