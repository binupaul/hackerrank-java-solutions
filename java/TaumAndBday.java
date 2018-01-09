package hackerrank;

import java.util.Scanner;

public class TaumAndBday {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            long blackItemCount = s.nextLong();
            long whiteItemCount = s.nextLong();
            
            long blackItemCost = s.nextLong();
            long whiteItemCost = s.nextLong();
            long conversionCost = s.nextLong();
            
            System.out.println(getTotalCost(blackItemCount, whiteItemCount,
                    blackItemCost, whiteItemCost, conversionCost));
        }
        s.close();    
    }
    
    private static long getTotalCost(long blackItemCount, long whiteItemCount, 
            long blackItemCost, long whiteItemCost, long conversionCost) {
        long totalCost = 0;
        if (blackItemCost <= whiteItemCost + conversionCost) {
            totalCost += blackItemCount * blackItemCost;
        } else {
            totalCost += blackItemCount * (whiteItemCost + conversionCost);
        }
        
        if (whiteItemCost <= blackItemCost + conversionCost) {
            totalCost += whiteItemCount * whiteItemCost;
        } else {
            totalCost += whiteItemCount * (blackItemCost + conversionCost);
        }
        return totalCost;
    }
}
