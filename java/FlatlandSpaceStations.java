package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class FlatlandSpaceStations {
    
    // NOTE: A linear time O(N) solution is possible
    // as mentioned in the editorial. The solution below
    // is log-linear (linearithmic)
    
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCities = in.nextInt();
        int numStations = in.nextInt();
        
        int[] stationIndices = new int[numStations];
        for (int i = 0; i < numStations; i++) {
            int index = in.nextInt();
            stationIndices[i] = index;
        }
        in.close();
        
        Arrays.sort(stationIndices);
        
        int maxOfDistanceBetweenEachStation = 0;
        for (int i = 0; i < numStations - 1; i++) {
            int distance = stationIndices[i + 1] - stationIndices[i];
            if (distance > maxOfDistanceBetweenEachStation) {
                maxOfDistanceBetweenEachStation = distance;
            }
        }
        
        int maxDistanceInStationLimit = maxOfDistanceBetweenEachStation / 2;
        int leftEdgeDistance = stationIndices[0];
        int rightEdgeDistance = (numCities - 1) - stationIndices[numStations - 1];
        
        int maxDistance = Math.max(maxDistanceInStationLimit, Math.max(leftEdgeDistance, rightEdgeDistance));
        System.out.println(maxDistance);
    }
    
    // linear time solution:
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCities = in.nextInt();
        int numStations = in.nextInt();
        
        boolean[] stationFlag = new boolean[numCities];
        for (int i = 0; i < numStations; i++) {
            int index = in.nextInt();
            stationFlag[index] = true;
        }
        in.close();
        
        int[] dToLeft = new int[numCities];
        for (int i = 0; i < numCities; i++) {
            if (stationFlag[i]) {
                dToLeft[i] = 0;
            } else {
                if (i == 0) {
                    dToLeft[i] = 100000000;
                } else {
                    dToLeft[i] = dToLeft[i - 1] + 1;
                }
            }
        }
        
        int[] dToRight = new int[numCities];
        for (int i = numCities - 1; i >= 0; i--) {
            if (stationFlag[i]) {
                dToRight[i] = 0;
            } else {
                if (i == numCities - 1) {
                    dToRight[i] = 100000000;
                } else {
                    dToRight[i] = dToRight[i + 1] + 1;
                }
            }
        }
        
        int maxDistance = 0;
        for (int i = 0; i < numCities; i++) {
            int distance = Math.min(dToLeft[i], dToRight[i]);
            if (distance > maxDistance) {
                maxDistance = distance;
            }
        }
        
        System.out.println(maxDistance);
    }
}
