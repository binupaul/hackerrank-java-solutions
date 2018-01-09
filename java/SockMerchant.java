package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {

    public static void main(String[] args) {

        // not using a hash table - instead sort and count

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = in.nextInt();
        }

        Arrays.sort(c);
        int i = 0;
        int count = 0;
        while (i < c.length - 1) {
            if (c[i] == c[i + 1]) {
                count++;
                i = i + 2;
                continue;
            }
            i = i + 1;
        }

        System.out.print(count);
        in.close();
    }
}
