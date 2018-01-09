package hackerrank;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int k = in.nextInt();
        in.close();
        
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (Math.abs(i - reverse(i)) % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
    
    private static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            num = num / 10 ;
            reversed = reversed * 10 + lastDigit;
        }
        return reversed;
    }
    
}
