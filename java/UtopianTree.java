package hackerrank;

import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int cycles = in.nextInt();
            int height = 0;

            if (cycles == 0) {
                height = 1;
            } else if (cycles % 2 == 0) {
                int j = cycles / 2;
                height = (int) (Math.pow(2, j + 1) - 1);
            } else {
                int j = (cycles + 1) / 2;
                height = (int) (Math.pow(2, j + 1) - 2);
            }

            System.out.println(height);
        }
        in.close();
    }
}
