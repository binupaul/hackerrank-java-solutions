package hackerrank;

import java.util.Scanner;

public class TripletComparison {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        int ptsA = 0;
        int ptsB = 0;

        if (a0 > b0) {
            ptsA++;
        } else if (b0 > a0) {
            ptsB++;
        }

        if (a1 > b1) {
            ptsA++;
        } else if (b1 > a1) {
            ptsB++;
        }

        if (a2 > b2) {
            ptsA++;
        } else if (b2 > a2) {
            ptsB++;
        }

        in.close();
        System.out.print(ptsA + " " + ptsB);
    }

}
