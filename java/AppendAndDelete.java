package hackerrank;

import java.util.Scanner;

public class AppendAndDelete {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String source = in.next();
        String target = in.next();
        int numOps = in.nextInt();
        in.close();

        int srcLen = source.length();
        int tgtLen = target.length();
        int matchedFromStart = regionMatchFromStart(source, target);

        // check the case of deleting the entire source
        // and adding entire target
        int minOps = srcLen + tgtLen;
        if (numOps >= minOps) {
            System.out.println("Yes");
            return;
        }

        // if nothing has been matched, only way is to delete entire source
        // and add entire target
        if (matchedFromStart == 0) {
            if (numOps < minOps) {
                System.out.println("No");
                return;
            }
        }

        if (matchedFromStart != 0) {
            // if some region is matched, find the un-matched parts length from
            // both source and target
            minOps = srcLen + tgtLen - 2 * matchedFromStart;

            // if this is odd, the proposed num ops should be odd - similarly if
            // even
            if (numOps >= minOps) {
                if (minOps % 2 == 1 && numOps % 2 == 1) {
                    System.out.println("Yes");
                } else if (minOps % 2 == 0 && numOps % 2 == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        }
    }

    private static int regionMatchFromStart(String s1, String s2) {
        int len = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (i >= s2.length()) {
                break;
            }
            if (s1.charAt(i) == s2.charAt(i)) {
                len++;
            } else {
                break;
            }
        }
        return len;
    }
}
