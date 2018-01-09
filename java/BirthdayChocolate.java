package hackerrank;

import java.util.Scanner;

public class BirthdayChocolate {
    // NOTE: This is not an O(n) solution, which is possible 
    // as given in the editorial
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numPieces = in.nextInt();
        int [] numbers = new int[numPieces];
        for (int i = 0; i < numPieces; i++) {
            numbers[i] = in.nextInt();
        }
        
        int d = in.nextInt();
        int m = in.nextInt();
        in.close();
        
        int count = 0;
        
        int ptr = 0;
        while (ptr <= numbers.length - m) {
            int sum = 0;
            for (int i = ptr; i < ptr + m; i++) {
                sum += numbers[i];
            }
            if (sum == d) {
                count++;
            }
            ptr++;
        }
        System.out.println(count);
    }
}
