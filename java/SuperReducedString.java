package hackerrank;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SuperReducedString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        ArrayDeque<Character> stack = new ArrayDeque<Character>();

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (stack.isEmpty()) {
                stack.addLast(chars[i]);
            } else {
                if (chars[i] == stack.peekLast()) {
                    stack.removeLast();
                } else {
                    stack.addLast(chars[i]);
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.print("Empty String");
        } else {
            Object[] objs = stack.toArray();
            for (int i = 0; i < objs.length; i++) {
                System.out.print(objs[i]);
            }
        }
        s.close();
    }
}
