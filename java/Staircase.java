package hackerrank;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            printBlocks(i + 1, n);
            System.out.println();
        }
        s.close();
    }

    private static void printBlocks(int blockCount, int width) {
        for (int j = 0; j < width - blockCount; j++) {
            System.out.print(' ');
        }

        for (int j = 0; j < blockCount; j++) {
            System.out.print('#');
        }
    }
}
