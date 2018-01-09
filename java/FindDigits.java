package hackerrank;

import java.util.Scanner;

public class FindDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCases = in.nextInt();
        for (int i = 0; i < numCases; i++) {
            int number = in.nextInt();
            int count = countEvenlyDivisibleDigits(number);
            System.out.println(count);
        }
        in.close();
    }
    
    private static int countEvenlyDivisibleDigits(int number) {
        int count = 0;
        int originalNum = number;
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit != 0 && originalNum % lastDigit == 0) {
                count++;
            }
            number = number / 10;
        }
        return count;
    }
}
