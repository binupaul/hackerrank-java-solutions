package hackerrank;

import java.util.Iterator;
import java.util.Scanner;

public class MarsExploration {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        s.close();
        
        Iterator<Character> SOSIterator = new SOS().iterator();
        char[] msg = str.toCharArray();
        int errCount = 0;
        for (Character c : msg) {
            if (!c.equals(SOSIterator.next())) {
                errCount++;
            }
        }
        
        System.out.println(errCount);
    }
    
    private static class SOS implements Iterable<Character> {
        @Override
        public Iterator<Character> iterator() {
           Iterator<Character> it = new Iterator<Character>() {
                private int i;
                
                @Override
                public boolean hasNext() {
                    return true;
                }

                @Override
                public Character next() {
                    Character nextChar = null;
                    if (i == 0) {
                        nextChar =  'S';
                    } else if (i == 1) {
                        nextChar =  'O';
                    } else if (i == 2) {
                        nextChar = 'S';
                    } 
                    i = (i + 1) % 3;
                    return nextChar;
                }
               
           };
           return it;
        }
    }
}
