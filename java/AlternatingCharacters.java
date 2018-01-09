package hackerrank;

import java.util.Scanner;

public class AlternatingCharacters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for (int i = 0; i < n; i++) {
            String str = s.next();
            char[] arr = str.toCharArray();
            int delCount = 0;
            
            char current = arr[0];
            for (int j = 1; j < arr.length; j++) {
                char next = arr[j];
                if (next == current) {
                    delCount++;
                } else {
                    current = next;
                }
            }
            System.out.println(delCount);
        }
        s.close();
    }
}
