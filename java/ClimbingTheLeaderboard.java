package hackerrank;

import java.util.Scanner;

public class ClimbingTheLeaderboard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numPlayers = in.nextInt();
        int[] playerScores = new int[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            playerScores[i] = in.nextInt();
        }
        
        int numLevelsPlayed = in.nextInt();
        int[] levelScores = new int[numLevelsPlayed];
        for (int i = 0; i < numLevelsPlayed; i++) {
            levelScores[i] = in.nextInt();
        }
        
        in.close();
        
        // find the leader board position end limit,
        // by counting the distinct scores.
        // we are not storing each leader board position.
        
        int hi = 1;
        int current = playerScores[0];
        for (int i = 1; i < numPlayers; i++) {
            if (playerScores[i] != current) {
                hi++;
                current = playerScores[i];
            }
        }
        
        // now, go upwards on the leader board,
        // calculate the leader board position for each of
        // our scores. we need to start from where we let off,
        // as our scores are cumulative and can only increase.
        
        int readIndex = numPlayers - 1;
        int count = 0;
        
        for (int i = 0; i < numLevelsPlayed; i++) {
            int levelScore = levelScores[i];
            
            // find count of players below this score:
            current = -1;
            while (readIndex >= 0) {
                int playerScore = playerScores[readIndex];
                if (playerScore > levelScore) {
                    break;
                }
                if (playerScore != current) {
                    current = playerScore;
                    count++;
                }
                readIndex--;
            }
            
            // our board position is computed from the
            // number of players we have overcome.
            
            int boardPosition = hi - count + 1;
            System.out.println(boardPosition);
        }
    }
}
