package hackerrank;

import java.util.Scanner;

public class CircularArrayRotation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numInts = s.nextInt();
        int numRotation = s.nextInt();
        int numQueries = s.nextInt();

        int arr[] = new int[numInts];
        for (int i = 0; i < numInts; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < numQueries; i++) {
            int queryIndex = s.nextInt();
            int oldQueryIndex = getOldIndex(queryIndex, numRotation, numInts);
            System.out.println(arr[oldQueryIndex]);
        }
        s.close();
    }

    public static int getOldIndex(int newIndex, int numShifts, int arrSize) {
        int oldIndex = newIndex - numShifts % arrSize;

        if (oldIndex < 0) {
            oldIndex = arrSize + oldIndex;
        }
        return oldIndex;
    }
}
