package hackerrank;

import java.util.Scanner;

public class InsertionSortPartTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        in.close();
        sortArray(ar);
    }

    private static void sortArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (val < arr[j]) {
                    arr[j + 1] = arr[j];
                    if (j == 0) {
                        arr[j] = val;
                    }
                } else {
                    arr[j + 1] = val;
                    break;
                }
            }
            printArray(arr);
        }
    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
