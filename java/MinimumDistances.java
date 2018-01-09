package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumDistances {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            int value = in.nextInt();
            items[i] = new Item(i, value);
        }
        in.close();
        
        // not using a map (the O(n) approach which uses the map to check for 
        // identical number and update last position)
        // instead sorting is used. O(n*logn)
        
        Arrays.sort(items);
        
        int min = -1;
        for (int i = 0; i < n - 1; i++) {
            if (items[i].getValue() == items[i + 1].getValue()) {
                int distance = Math.abs(items[i].getIndex() - items[i + 1].getIndex());
                if (min == -1 || (distance < min)) {
                    min = distance;
                } 
            }
        }
        
        System.out.println(min);
    }
    
    static class Item implements Comparable<Item> {
        private int index;
        private int value;
        
        public Item(int index, int value) {
            this.index = index;
            this.value = value;
        }
        
        public int getIndex() {
            return index;
        }
        
        public void setIndex(int index) {
            this.index = index;
        }
        
        public int getValue() {
            return value;
        }
        
        public void setValue(int value) {
            this.value = value;
        }

        @Override
        public int compareTo(Item item) {
            if (item.value == this.value) {
                return 0;
            } else if (item.value < this.value) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
