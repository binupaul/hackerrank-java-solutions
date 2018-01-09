package hackerrank;

import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int actualDay = in.nextInt();
        int actualMonth = in.nextInt();
        int actualYear = in.nextInt();
        
        int expectedDay = in.nextInt();
        int expectedMonth = in.nextInt();
        int expectedYear = in.nextInt();
        in.close();
        
        int fine = 0;
        
        if (actualYear > expectedYear) {
            fine = 10000;
        } else if (actualYear == expectedYear) {
            if (actualMonth > expectedMonth) {
                fine = 500 * (actualMonth - expectedMonth);
            } else if (actualMonth == expectedMonth) {
                if (actualDay > expectedDay) {
                    fine = 15 * (actualDay - expectedDay);
                }
            }
        }
        System.out.println(fine);
    }
}
