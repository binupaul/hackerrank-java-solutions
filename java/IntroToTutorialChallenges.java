package hackerrank;

import java.util.Scanner;

public class IntroToTutorialChallenges {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valToSearch = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int index = findIndex(arr, valToSearch);
        System.out.println(index);
        in.close();
    }

    public static int findIndex(int[] arr, int valToSearch) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == valToSearch) {
                return mid;
            }
            if (valToSearch > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
