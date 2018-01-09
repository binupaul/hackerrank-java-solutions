package hackerrank;

import java.util.Scanner;

public class CavityMap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            String str = s.next();
            char[] strchars = str.toCharArray();
            arr[i] = strchars;
        }
        s.close();
        printArr(n, arr);
    }
    
    private static void printArr(int n, char[][] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isCavity(i, j, n, arr)) {
                    System.out.print('X');
                } else {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }
    }
    
    private static boolean isCavity(int i, int j, int n, char[][] arr) {
        if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
            return false;
        }
        
        if ((arr[i][j] > arr[i + 1][j]) &&
                (arr[i][j] > arr[i - 1][j]) &&
                (arr[i][j] > arr[i][j + 1]) &&
                (arr[i][j] > arr[i][j - 1])
                ) {
            return true;
        }
        return false;
    }
}
