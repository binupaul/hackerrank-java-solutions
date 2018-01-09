package hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ManasaAndStones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numTests = in.nextInt();
        for (int i = 0; i < numTests; i++) {
            int numStones = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            printValuesForLastStone(numStones, a, b);
        }
        in.close();
    }
    
    private static void printValuesForLastStone(int numStones, int a, int b) {
        List<Integer> numbers = new ArrayList<>();
        if (a == b) {
            numbers.add(a * (numStones - 1));
        } else {
            if (a < b) {
                int temp = a;
                a = b;
                b = temp;
            }
            // find all the pairs (i, j) that add up to n - 1
            // using each pair(i, j), find a*i + b*j
            for (int i = 0; i < numStones; i++) {
                int j = (numStones - 1) - i;
                int number = a * i + b * j;
                numbers.add(number);
            }
        }
        
        for (Integer n : numbers) {
            System.out.print(n);
            System.out.print(' ');
        }
        System.out.println();
    }
    
    // NOTE: below, the brute force method
    // that exponentially evaluates all the possible values.
    
    @SuppressWarnings("unused")
    private static void printValuesForLastStoneBruteForce(int numStones, int a, int b) {
        Set<Integer> numbers = new TreeSet<>();
        Set<Integer> tempSet = new HashSet<>();
        numbers.add(0);
        
        for (int i = 1; i < numStones; i++) {
            for (Integer n : numbers) {
                tempSet.add(n + a);
                tempSet.add(n + b);
            }
            numbers.clear();
            numbers.addAll(tempSet);
            tempSet.clear();
        }
        
        for (Integer n : numbers) {
            System.out.print(n);
            System.out.print(' ');
        }
        System.out.println();
    }
}
