package hackerrank;

import java.util.Scanner;

public class SherlockAndSquares {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int lowerLimit = in.nextInt();
            int upperLimit = in.nextInt();
            System.out.println(getSquareNumCount(lowerLimit, upperLimit));
        }
        in.close();
    }

    private static int getSquareNumCount(int a, int b) {
        int count = (int) Math.floor(Math.sqrt(b)) - (int) Math.ceil(Math.sqrt(a)) + 1;
        return count;
    }
}
