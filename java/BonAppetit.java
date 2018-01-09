package hackerrank;

import java.util.Scanner;

public class BonAppetit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalItems = in.nextInt();
        int itemRejected = in.nextInt();

        int proposedCharged = 0;
        for (int i = 0; i < totalItems; i++) {
            int price = in.nextInt();
            if (i != itemRejected) {
                proposedCharged += price;
            }
        }

        int actualCharged = in.nextInt();
        int refund = (actualCharged - proposedCharged / 2);
        if (refund == 0) {
            System.out.print("Bon Appetit");
        } else {
            System.out.print(refund);
        }
        in.close();
    }
}
