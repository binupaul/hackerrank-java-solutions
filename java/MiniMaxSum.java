package hackerrank;

import java.util.Scanner;

public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long firstNum = in.nextLong();
        long min = firstNum;
        long max = firstNum;
        long sum = firstNum;

        for (int i = 0; i < 4; i++) {
            long nextNum = in.nextLong();
            sum += nextNum;
            if (nextNum > max) {
                max = nextNum;
            }
            if (nextNum < min) {
                min = nextNum;
            }
        }
        in.close();
        System.out.print((sum - max) + " " + (sum - min));
    }
}
