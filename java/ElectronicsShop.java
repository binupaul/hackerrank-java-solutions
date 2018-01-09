package hackerrank;

import java.util.Scanner;

public class ElectronicsShop {
    
    // NOTE: A more efficient method is given
    // in the discussion forum. The solution below is
    // the same as the one given in the editorial.
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int money = in.nextInt();
        int kbdCount = in.nextInt();
        int usbCount = in.nextInt();
        
        int[] kbdPrices = new int[kbdCount];
        int[] usbPrices = new int[usbCount];
        
        for (int i = 0; i < kbdCount; i++) {
            kbdPrices[i] = in.nextInt();
        }
        
        for (int i = 0; i < usbCount; i++) {
            usbPrices[i] = in.nextInt();
        }
        in.close();
        
        int kbdPtr = 0;
        int max = -1;
        
        while (kbdPtr < kbdCount) {
            int usbPtr = 0;
            while (usbPtr < usbCount) {
                int sum = kbdPrices[kbdPtr] + usbPrices[usbPtr];
                if (sum <= money) {
                    if (sum > max) {
                        max = sum;
                    }
                }
                usbPtr++;
            }
            kbdPtr++;
        }
        
        System.out.println(max);
    }
}
