package hackerrank;

import java.util.Scanner;

public class TheHurdleRace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int maxHeight = 0;
        for (int i = 0; i < n; i++) {
            int height = in.nextInt();
            if (height > maxHeight) {
                maxHeight = height;
            }
        }

        in.close();
        int numBoosts = maxHeight - k;
        System.out.println(numBoosts < 0 ? 0 : numBoosts);
    }
}
