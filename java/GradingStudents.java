package hackerrank;

import java.util.Scanner;

public class GradingStudents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int grade = in.nextInt();
            if (grade < 38) {
                System.out.println(grade);
            } else {
                System.out.println(roundup(grade));
            }
        }
        in.close();
    }

    private static int roundup(int grade) {
        if ((grade + 1 <= 100) && ((grade + 1) % 5 == 0)) {
            return (grade + 1);
        }

        if ((grade + 2 <= 100) && ((grade + 2) % 5 == 0)) {
            return (grade + 2);
        }

        return grade;
    }
}
