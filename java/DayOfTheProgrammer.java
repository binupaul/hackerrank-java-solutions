package hackerrank;

import java.util.Scanner;

public class DayOfTheProgrammer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        System.out.println(getProgrammerDay(year));
        s.close();
    }

    private static String getProgrammerDay(int year) {
        int months[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (isLeapYear(year)) {
            months[1] = 29;
        }

        if (year == 1918) {
            months[1] = 28 - 13;
        }

        int sum = 0;
        int i = 0;
        int prevsum = 0;
        while (sum < 256) {
            prevsum = sum;
            sum = sum + months[i];
            i++;
        }
        int month = i;
        int day = 256 - prevsum;

        String date = (day < 10 ? ("0" + day) : day) + "." + (month < 10 ? ("0" + month) : month) + "." + year;
        return date;
    }

    private static boolean isLeapYear(int year) {
        if (year > 1918) {
            // gregorian
            return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
        } else if (year < 1918) {
            // julian
            return (year % 4 == 0);
        } else {
            // transition year
            return false;
        }
    }
}
