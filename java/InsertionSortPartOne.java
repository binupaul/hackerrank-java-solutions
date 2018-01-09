package hackerrank;

import java.util.Scanner;

public class InsertionSortPartOne {

    public static void insertIntoSorted(int[] arr) {
        int val = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (val < arr[i]) {
                arr[i + 1] = arr[i];
                printArray(arr);
                if (i == 0) {
                    arr[i] = val;
                    printArray(arr);
                }
            } else {
                arr[i + 1] = val;
                printArray(arr);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        in.close();
        insertIntoSorted(ar);
    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
