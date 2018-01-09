package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        
        Arrays.sort(arr);
        
        int ptr1 = 0;
        int ptr2 = 0;
        int count = 0;
        
        while (ptr2 < n) {
            int diff = arr[ptr2] - arr[ptr1];
            if (diff == k) {
                ptr1++;
                ptr2++;
                count++;
            } else if (diff < k) {
                ptr2++;
            } else if (diff > k) {
                ptr1++;
            }
        }
        
        System.out.println(count);
    }
}
