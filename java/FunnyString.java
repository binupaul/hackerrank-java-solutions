package hackerrank;

import java.util.Scanner;

public class FunnyString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        for (int i = 0; i < count; i++) {
            String str = in.next();
            char[] chars = str.toCharArray();
            if (isFunny(chars)) {
                System.out.println("Funny");
            } else {
                System.out.println("Not Funny");
            }
        }
        in.close();
    }

    private static boolean isFunny(char[] chars) {
        int len = chars.length;
        for (int i = 0; i < len / 2; i++) {
            int diff1 = Math.abs(chars[i + 1] - chars[i]);
            int diff2 = Math.abs(chars[(len - 1) - i] - chars[(len - 2) - i]);
            if (diff1 != diff2) {
                return false;
            }
        }
        return true;
    }
}
