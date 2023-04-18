//Maheshwar(2141014002)
/*
Write a java program to traverse a graph using depth first search (use
Stack collection )
 */
import java.util.*;

public class Q6{

    private int numVertices;
    private LinkedList<Integer>[] adjacencyList;

    public Q6(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new LinkedList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    public void DFS(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        Stack<Integer> stack = new Stack<>();
        stack.push(startVertex);

        while (!stack.isEmpty()) {
            int currentVertex = stack.pop();

            if (!visited[currentVertex]) {
                System.out.print(currentVertex + " ");
                visited[currentVertex] = true;
            }

            Iterator<Integer> iterator = adjacencyList[currentVertex].listIterator();
            while (iterator.hasNext()) {
                int adjacentVertex = iterator.next();
                if (!visited[adjacentVertex]) {
                    stack.push(adjacentVertex);
                }
            }
        }
    }

    public static void main(String[] args) {
        Q6 graph = new Q6(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.DFS(0);
    }
}
