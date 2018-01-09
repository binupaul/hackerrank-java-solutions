package hackerrank;

import java.util.Scanner;

public class HardQuestions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String vin = s.next();
        String cat = s.next();
        
        char[] arrVin = vin.toCharArray();
        char[] arrCat = cat.toCharArray();
        s.close();
        
        int wrongCount = 0;
        for (int i = 0; i < n; i++) {
            if (arrVin[i] == '.') {
                wrongCount++;
                continue;
            }
            if (arrVin[i] == arrCat[i]) {
                wrongCount++;
            }
        }
        
        System.out.println(n - wrongCount);
    }
}
