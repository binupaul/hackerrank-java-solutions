package hackerrank;

import java.util.Scanner;

public class EqualizeTheArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = s.nextInt();
        }
        s.close();

        int[] frequencyCounts = new int[100];
        int maxFrequencyCount = 0;

        for (int i = 0; i < n; i++) {
            int number = numbers[i];
            frequencyCounts[number - 1]++;
            if (frequencyCounts[number - 1] > maxFrequencyCount) {
                maxFrequencyCount = frequencyCounts[number - 1];
            }
        }

        System.out.println(n - maxFrequencyCount);
    }
}
