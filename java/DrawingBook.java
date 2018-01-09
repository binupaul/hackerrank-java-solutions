package hackerrank;

import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
        in.close();
    }

    public static int solve(int n, int p) {
        boolean pageIsEven = (p % 2 == 0);
        int pageMadeEven = pageIsEven ? p : (p - 1);
        int flipsFromFront = pageMadeEven / 2;

        boolean totalPageIsEven = (n % 2 == 0);
        int totalPageMadeEven = totalPageIsEven ? n : (n - 1);
        int flipsFromBack = (totalPageMadeEven - pageMadeEven) / 2;

        if (flipsFromBack < flipsFromFront) {
            return flipsFromBack;
        } else {
            return flipsFromFront;
        }
    }
}
