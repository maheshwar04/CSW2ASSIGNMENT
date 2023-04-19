//Maheshwar(2141014002)
/*
 Write a java program to traverse a graph using breadth first search (use
ArrayDeque collection ).

 */
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class A2AQ5 {
    
    private int numVertices;
    private List<List<Integer>> adjList;
    
    public A2AQ5(int numVertices) {
        this.numVertices = numVertices;
        adjList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }
    
    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }
    
    public void breadthFirstSearch(int start) {
        boolean[] visited = new boolean[numVertices];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        
        visited[start] = true;
        queue.offer(start);
        
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");
            
            List<Integer> neighbors = adjList.get(currentVertex);
            for (int neighbor : neighbors) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }
    
    public static void main(String[] args) {
       A2AQ5 graph = new A2AQ5(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.breadthFirstSearch(0);
    }
}

