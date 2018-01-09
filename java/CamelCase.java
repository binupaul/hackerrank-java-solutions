package hackerrank;

import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] chars = s.toCharArray();
        int wordCount = 1;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                wordCount++;
            }
        }

        System.out.print(wordCount);
        in.close();
    }
}
