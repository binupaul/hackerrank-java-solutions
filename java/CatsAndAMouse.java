package hackerrank;

import java.util.Scanner;

public class CatsAndAMouse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numQueries = in.nextInt();
        for (int i = 0; i < numQueries; i++) {
            int cataXPos = in.nextInt();
            int catbXPos = in.nextInt();
            int mouseXPos = in.nextInt();
            
            int dcatA = Math.abs(mouseXPos - cataXPos);
            int dcatB = Math.abs(mouseXPos - catbXPos);
            
            if (dcatA < dcatB) {
                System.out.println("Cat A");
            } else if (dcatB < dcatA) {
                System.out.println("Cat B");
            } else {
                System.out.println("Mouse C");
            }
        }
        in.close();
    }
}
