package hackerrank;

import java.util.Scanner;

public class ServiceLane {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numSegments = in.nextInt();
        int numTestCases = in.nextInt();
        
        int[] segmentWidths = new int[numSegments];
        for (int i = 0; i < numSegments; i++) {
            segmentWidths[i] = in.nextInt();
        }
        
        for (int i = 0; i < numTestCases; i++) {
            int entryIndex = in.nextInt();
            int exitIndex = in.nextInt();
            System.out.println(findMin(segmentWidths, entryIndex, exitIndex));
        }
        in.close();
    }
    
    private static int findMin(int[] widths, int start, int stop) {
        int min = widths[start];
        for (int i = (start+1); i <= stop; i++ ) {
            if (widths[i] < min) {
                min = widths[i];
            }
        }
        return min;
    }
}
