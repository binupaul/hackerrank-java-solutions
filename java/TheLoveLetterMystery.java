package hackerrank;

import java.util.Scanner;

public class TheLoveLetterMystery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCases = in.nextInt();
        for (int i = 0; i < numCases; i++) {
            String str = in.next();
            System.out.println(getOpCount(str));
        }
        in.close();
    }
    
    private static int getOpCount(String str) {
        char[] arr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length/2; i++) {
            char current = arr[i];
            char pair = arr[arr.length - 1 - i];
            count += Math.abs(current - pair);
        }
        return count;
    }
}
