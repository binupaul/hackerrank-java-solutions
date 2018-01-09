package hackerrank;

import java.util.Scanner;

public class ChocolateFeast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int trips = in.nextInt();
        for (int i = 0 ; i < trips; i++) {
            int cashAtHand = in.nextInt();
            int pricePerItem = in.nextInt();
            int wrapperTradeInAt = in.nextInt();
            System.out.println(getTotal(cashAtHand, pricePerItem, wrapperTradeInAt));
        }
        in.close();
    }
    
    private static int getTotal(int cashAtHand, int pricePerItem, int wrapperTradeInAt) {
        int total = cashAtHand/pricePerItem;
        int wrapperCount = total;
        while (wrapperCount >= wrapperTradeInAt) {
            int itemsGotByTradeIn = wrapperCount/wrapperTradeInAt;
            int leftOverWrappers = wrapperCount % wrapperTradeInAt;
            total += itemsGotByTradeIn;
            wrapperCount = itemsGotByTradeIn + leftOverWrappers;
        }
        return total;
    }
}
