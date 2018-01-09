package hackerrank;

import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String[] timeparts = str.split(":");

        boolean isAM = str.endsWith("AM");
        String hours = timeparts[0];
        String mins = timeparts[1];
        String secs = timeparts[2].replace("AM", "").replace("PM", "");

        String milHours = null;
        String milMins = mins;
        String milSecs = secs;

        int intHours = Integer.parseInt(hours);
        if (intHours == 12) {
            if (isAM) {
                milHours = "00";
            } else {
                milHours = "12";
            }
        } else {
            if (!isAM) {
                intHours = 12 + intHours;
            }
            milHours = (intHours < 12) ? ("0" + intHours) : (Integer.toString(intHours));
        }

        System.out.print(milHours + ":" + milMins + ":" + milSecs);
        s.close();
    }
}
