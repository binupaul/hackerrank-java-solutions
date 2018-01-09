package hackerrank;

import java.util.Scanner;

public class DesignerPDFViewer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] letterHeights = new int[26];

        for (int i = 0; i < 26; i++) {
            letterHeights[i] = in.nextInt();
        }

        String word = in.next();
        in.close();

        int maxHeight = 0;
        for (char x : word.toCharArray()) {
            int currentHeight = letterHeights[x - 'a'];
            if (currentHeight > maxHeight) {
                maxHeight = currentHeight;
            }
        }

        System.out.println(maxHeight * word.length());
    }
}
