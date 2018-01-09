package hackerrank;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BFSShortestReach {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numQueries = in.nextInt();

        for (int i = 0; i < numQueries; i++) {
            int numNodes = in.nextInt();
            int numEdges = in.nextInt();
            Graph graph = new Graph(numNodes, numEdges, 6);
            for (int j = 0; j < numEdges; j++) {
                int edgeBegin = in.nextInt();
                int edgeEnd = in.nextInt();
                graph.addEdge(edgeBegin, edgeEnd);
            }
            int startNode = in.nextInt();
            int[] distances = graph.computeShortestDistanceFrom(startNode);
            printDistances(distances, startNode);
        }
        in.close();
    }

    private static void printDistances(int[] distances, int startNode) {
        for (int k = 0; k < distances.length; k++) {
            if (k != startNode - 1) {
                System.out.print(distances[k]);
                if (k != distances.length - 1) {
                    System.out.print(' ');
                }
            }
        }
        System.out.println();
    }
}

class Graph {
    private List<Integer>[] adjacencyList;
    private int[] distances;
    private boolean[] visited;
    private int weight;

    @SuppressWarnings("unchecked")
    public Graph(int nodes, int edges, int weight) {
        this.weight = weight;
        adjacencyList = new List[nodes];
        for (int i = 0; i < nodes; i++) {
            adjacencyList[i] = new ArrayList<Integer>();
        }
        distances = new int[nodes];
        for (int i = 0; i < distances.length; i++) {
            distances[i] = -1;
        }
        visited = new boolean[nodes];
    }

    public void addEdge(int start, int end) {
        if (adjacencyList[start - 1].contains(end - 1))
            return;
        if (start != end) {
            adjacencyList[start - 1].add(end - 1);
            adjacencyList[end - 1].add(start - 1);
        }
    }

    public int[] computeShortestDistanceFrom(int startNode) {
        ArrayDeque<Integer> fifo = new ArrayDeque<Integer>();
        fifo.add(startNode - 1);
        distances[startNode - 1] = 0;
        visited[startNode - 1] = true;

        while (!fifo.isEmpty()) {
            int current = fifo.remove();
            List<Integer> reachableNodes = adjacencyList[current];
            for (Integer i : reachableNodes) {
                if (!visited[i]) {
                    visited[i] = true;
                    distances[i] = distances[current] + weight;
                    fifo.add(i);
                }
            }
        }
        return distances;
    }
}