package hackerrank;

import java.util.Scanner;

public class ExtraLongFactorials {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        
        java.math.BigInteger result = java.math.BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            java.math.BigInteger current = java.math.BigInteger.valueOf(i);
            result = result.multiply(current);
        }
        System.out.println(result);
    }
}
