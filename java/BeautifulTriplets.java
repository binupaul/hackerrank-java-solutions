package hackerrank;

import java.util.Scanner;

public class BeautifulTriplets {
    // NOTE: This implementation (O(nlogn) uses binary search 
    // to check if the values aj and ak exist for the 
    // given ai. The editorial solution (O(n)) uses an array of 
    // flags (the array size being the constraint limit on n)
    // to check if the numbers exist.
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        in.close();
        
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int y = d + x;
            int j = getIndexOfNumber(nums, i + 1, y);
            if (j != -1) {
                int z = y + d;
                int k = getIndexOfNumber(nums, j + 1, z);
                if (k != -1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
    private static int getIndexOfNumber(int[] nums, int startIndex, int number) {
        int lo = startIndex;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] == number) {
                return mid;
            }
            if (number > nums[mid]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }
}
