package hackerrank;

import java.util.Scanner;

public class DivisibleSumPairs {
    
    // NOTE: Linear solution exists. The editorial
    // gives a quadratic time solution. The solution below
    // is linear.
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numInts = s.nextInt();
        int divisor = s.nextInt();
        
        int[] numbers = new int[numInts];
        for (int i = 0; i < numInts; i++) {
            numbers[i] = s.nextInt();
        }
        s.close();
        
        // create buckets of remainders - indices being 
        // the remainders
        int[] remainders = new int[divisor];
        for (int i = 0; i < numInts; i++) {
            int remainder = numbers[i] % divisor;
            remainders[remainder]++;
        }
        
        // (a + b) is divisible by k if (a % k + b % k) is zero or k
        // Here we handle the special case for zero. Also it is required to 
        // traverse only till divisor/2 (improvement-todo)
        int count = 0;
        for (int i = 0; i < divisor; i++) {
            if (i == 0) {
                count += remainders[i] * (remainders[i] - 1) / 2;
                remainders[i] = 0;
            } else {
                int pairedRemainder = divisor - i;
                if (pairedRemainder == i) {
                    count += remainders[i] * (remainders[i] - 1) / 2;
                } else {
                    count += remainders[i] * remainders[pairedRemainder];
                }
                remainders[i] = 0;
                remainders[pairedRemainder] = 0;
            }
        }
        System.out.println(count);  
    }
}
