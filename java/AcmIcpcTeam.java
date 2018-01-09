package hackerrank;

import java.util.BitSet;
import java.util.Scanner;

public class AcmIcpcTeam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numPeople = in.nextInt();
        int numTopics = in.nextInt();
        BitSet[] topics = new BitSet[numPeople];

        for (int i = 0; i < numPeople; i++) {
            String strTopic = in.next();
            BitSet bitset = new BitSet(numTopics);
            setBitsInBitSet(bitset, strTopic);
            topics[i] = bitset;
        }

        in.close();

        int maxTopicCountTillNow = 0;
        int countOfPairsWithMaxTopicCount = 0;

        for (int i = 0; i < numPeople - 1; i++) {
            for (int j = i + 1; j < numPeople; j++) {
                BitSet cloned = (BitSet) topics[i].clone();
                cloned.or(topics[j]);
                int topicCountForThisPair = cloned.cardinality();
                if (topicCountForThisPair > maxTopicCountTillNow) {
                    maxTopicCountTillNow = topicCountForThisPair;
                    countOfPairsWithMaxTopicCount = 1;
                } else if (topicCountForThisPair == maxTopicCountTillNow) {
                    countOfPairsWithMaxTopicCount++;
                }
            }
        }
        System.out.println(maxTopicCountTillNow);
        System.out.println(countOfPairsWithMaxTopicCount);
    }

    private static void setBitsInBitSet(BitSet bitset, String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '1') {
                bitset.set(i);
            }
        }
    }
}
