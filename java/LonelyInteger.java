package hackerrank;

import java.util.Scanner;

public class LonelyInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int acc = in.nextInt();
        for (int i = 1; i < n; i++) {
            int read = in.nextInt();
            acc = acc ^ read;
        }

        System.out.println(acc);
        in.close();
    }
}
