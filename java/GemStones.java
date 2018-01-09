package hackerrank;

import java.util.Scanner;

public class GemStones {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] count = new int[26];
        
        for (int i = 0; i < n; i++) {
            boolean[] present = new boolean[26];
            String str = s.next();
            char[] arr = str.toCharArray();
            for (int j = 0; j < arr.length; j++) {
                if (!present[arr[j] - 'a']) {
                    present[arr[j] - 'a'] = true;
                    count[arr[j] - 'a']++;
                }
            }
        }
        
        int elemCount = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] == n) {
                elemCount++;
            }
        }
        System.out.println(elemCount++);
        s.close();
    }
}
