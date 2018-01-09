package hackerrank;

import java.util.Scanner;

public class TheBombermanGame {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();
        int seconds = s.nextInt();
        
        char [][] arr = new char[rows][cols];
        int [][] age = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            String str = s.next();
            char[] strchars = str.toCharArray();
            arr[i] = strchars;
        }
        
        for (int i = 1; i <= seconds; i++) {
            incrementAge(rows, cols, arr, age);
            
            if (i == 1) {
                continue;
            }
            
            if (i % 2 == 0) {
                plantBombs(rows, cols, arr, age);
            } else {
                detonate(rows, cols, arr, age);
            }
        }
        
        printArr(rows, cols, arr);
        s.close();
    }
    
    private static void printArr(int rows, int cols, char[][] arr) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    
    private static void incrementAge(int rows, int cols, char[][] arr, int[][] age) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 'O') {
                    age[i][j]++;
                }
            }
        }
    }
    
    private static void plantBombs(int rows, int cols, char[][] arr, int[][] age) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == '.') {
                    arr[i][j] = 'O';
                    age[i][j] = 0;
                }
            }
        }
    }
    
    private static void detonate(int rows, int cols, char[][] arr, int[][] age) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (age[i][j] == 3) {
                    arr[i][j] = 'X';
                    if (i != 0) {
                        arr[i - 1][j] = 'X';
                    } 
                    if (i != rows - 1) {
                        arr[i + 1][j] = 'X';
                    }
                    
                    if (j != 0) {
                        arr[i][j - 1] = 'X';
                    }
                    if (j != cols - 1) {
                        arr[i][j + 1] = 'X';
                    }
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 'X') {
                    arr[i][j] = '.';
                    age[i][j] = 0;
                }
            }
        }
    }
}
