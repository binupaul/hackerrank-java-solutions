package hackerrank;

import java.util.Scanner;

public class ModifiedKaprekarNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isModKaprekar(i)) {
                System.out.print(i);
                System.out.print(" ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("INVALID RANGE");
        }
    }
    
    private static boolean isModKaprekar(int n) {
        int numDigits = numDigits(n);
        long squared = (long)n * n;
        int rightPart = getRightPart(squared, numDigits);
        int leftPart = getLeftPart(squared, rightPart, numDigits);
        return (n == leftPart + rightPart); 
    }
    
    private static int getLeftPart(long n, int rightPart, int digitCount) {
        return (int) ((n - rightPart)/(int)(Math.pow(10, digitCount)));
    }
    
    private static int getRightPart(long n, int digitCount) {
        return (int) (n % (int) (Math.pow(10, digitCount)));
    }
    
    private static int numDigits(int n) {
        if (n < 1000) {
            if ( n < 100) {
                if ( n < 10) {
                    return 1;
                } else {
                    return 2;
                }
            } else {
                return 3;
            }
         } else {
             if ( n < 10000) {
                 return 4;
             } else {
                 return 5;
             }
         }
    }
}
