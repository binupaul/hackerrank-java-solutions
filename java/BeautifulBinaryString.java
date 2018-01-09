package hackerrank;

import java.util.Scanner;

public class BeautifulBinaryString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        @SuppressWarnings("unused")
        int len = s.nextInt();
        String str = s.next();
        char[] arr  = str.toCharArray();
        
        int count = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == '0') {
                if (i + 2 < arr.length) {
                    if (arr[i + 1] == '1' && arr[i + 2] == '0') {
                        arr[i + 2] = '1';
                        count++;
                    }
                }
            } 
            i++;
        }
        s.close();
        System.out.println(count);
    }
}
