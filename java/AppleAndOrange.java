package hackerrank;

import java.util.Scanner;

public class AppleAndOrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();   // house start
        int t = in.nextInt();   // house end
        int a = in.nextInt();   // apple tree
        int b = in.nextInt();   // orange tree
        int m = in.nextInt();   // count of apples
        int n = in.nextInt();   // count of oranges
        
        int[] dApple = new int[m];
        for (int i = 0; i < m; i++){
            dApple[i] = in.nextInt();
        }
        
        int[] dOrange = new int[n];
        for (int i = 0; i < n; i++){
            dOrange[i] = in.nextInt();
        }
        
        in.close();
        
        int appleCount = 0;
        for (int i = 0; i < m; i++){
            if (dApple[i] > 0 && a + dApple[i] >= s && a + dApple[i] <= t) {
                appleCount++;
            }
        }
        
        int orangeCount = 0;
        for (int i = 0; i < n; i++){
            if (dOrange[i] < 0 && b + dOrange[i] >= s && b + dOrange[i] <= t) {
                orangeCount++;
            }
        }
        
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}
