package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TheTimeInWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hours = s.nextInt();
        int minutes = s.nextInt();
        s.close();
        
        String strTime = null;
        Map<Integer, String> map = getWordDict();
        
        if (minutes == 0) {
            strTime = map.get(hours) + " o' clock";
        } else if (minutes == 15 || minutes == 30) {
            strTime = map.get(minutes) + " past " + map.get(hours);
        } else if (minutes > 30) {
            int remaining = 60 - minutes;
            if (remaining == 15) {
                strTime = map.get(remaining) + " to " + map.get(hours + 1);
            } else {
                strTime = map.get(remaining) + " minute" + ((minutes == 1) ? "" : "s")  + " to " + map.get(hours + 1);
            }
        } else if (minutes < 30) {
            strTime = map.get(minutes) + " minute" + ((minutes == 1) ? "" : "s")  + " past " + map.get(hours);
        } 
        
        System.out.println(strTime);
    }
    
    public static Map<Integer, String> getWordDict() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
        map.put(13, "thirteen");
        map.put(14, "fourteen");
        map.put(15, "quarter");
        map.put(16, "sixteen");
        map.put(17, "seventeen");
        map.put(18, "eighteen");
        map.put(19, "nineteen");
        map.put(20, "twenty");
        map.put(21, "twenty one");
        map.put(22, "twenty two");
        map.put(23, "twenty three");
        map.put(24, "twenty four");
        map.put(25, "twenty five");
        map.put(26, "twenty six");
        map.put(27, "twenty seven");
        map.put(28, "twenty eight");
        map.put(29, "twenty nine");
        map.put(30, "half");
        return map;
    }
}
