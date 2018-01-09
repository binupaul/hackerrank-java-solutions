package hackerrank;

import java.util.Scanner;

public class SimpleArraySum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + s.nextInt();
        }
        s.close();
        System.out.print(sum);
    }
}
