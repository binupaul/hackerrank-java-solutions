package hackerrank;

import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        long n = in.nextLong();
        in.close();

        long repeatCounts = n / str.length();
        long leftOver = n % str.length();
        int countInStr = getCountInStr(str);
        int countInLeftOver = 0;

        if (leftOver > 0) {
            String leftOverStr = str.substring(0, (int) leftOver);
            countInLeftOver = getCountInStr(leftOverStr);
        }
        long totalCount = repeatCounts * countInStr + countInLeftOver;
        System.out.println(totalCount);
    }

    private static int getCountInStr(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }
}
