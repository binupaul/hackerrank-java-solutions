package hackerrank;

import java.util.Scanner;

public class SequenceEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ptox = new int[51];
        
        // map x values to p values.
        for (int i = 0; i < n; i++) {
            int p = in.nextInt();
            ptox[p] = i + 1;
        }
        
        in.close();
        
        // p(p(y)) = x.
        // If p(y) = z, then
        // p(z) = x as per statement. We
        // need to get to y from x.
        
        for (int i = 1; i <= n; i++) {
            int z = ptox[i];
            int y = ptox[z];
            System.out.println(y);
        }
    }
}
