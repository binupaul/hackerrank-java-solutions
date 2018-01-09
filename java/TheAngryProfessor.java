package hackerrank;

import java.util.Scanner;

public class TheAngryProfessor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int numStudents = in.nextInt();
            int cancelThreshold = in.nextInt();
            int numStudentsPresent = 0;
            boolean canceled = true;

            int[] arrivalTimes = new int[numStudents];
            for (int j = 0; j < numStudents; j++) {
                int arrivalTime = in.nextInt();
                arrivalTimes[j] = arrivalTime;
            }

            for (int j = 0; j < numStudents; j++) {
                if (arrivalTimes[j] <= 0) {
                    numStudentsPresent++;
                }
                if (numStudentsPresent >= cancelThreshold) {
                    canceled = false;
                    break;
                }
            }

            System.out.println(canceled ? "YES" : "NO");
        }
        in.close();
    }
}
