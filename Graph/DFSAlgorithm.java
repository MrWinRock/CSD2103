import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Graph {
    private int V;
    private List<List<Integer>> adj;

    public Graph(int V) {
        this.V = V;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new LinkedList<>());
        }
    }

    public void addEdge(int v, int w) {
        adj.get(v).add(w);
    }

    public void dfs(int startVertex) {
        boolean[] visited = new boolean[V]; // สร้าง array เก็บ vertex ที่ไปแล้ว
        dfsRecursive(startVertex, visited); 
    }

    private void dfsRecursive(int vertex, boolean[] visited) {
        visited[vertex] = true; // mark vertex ตัวปัจจุบันว่าไปแล้ว
        System.out.print(vertex + " "); // print vertex

        for (int neighbor : adj.get(vertex)) { // loop หาตัวที่อยู่ติดกัน
            if (!visited[neighbor]) { // check ว่า vertex ที่อยู่ติดกันเคยไปแล้วหรือไม่
                dfsRecursive(neighbor, visited); // ถ้ายังไม่เคยไป ทำการเรียกซ่ำ method
            }
        }
    }

    public void dfsIterative(int startVertex) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(startVertex);

        while (!stack.isEmpty()) {
            int vertex = stack.pop();

            if (!visited[vertex]) {
                visited[vertex] = true;
                System.out.print(vertex + " ");

                for (int neighbor : adj.get(vertex)) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
}

public class DFSAlgorithm {
    public static void main(String[] args) {
        int V = 5;
        Graph graph = new Graph(V);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.print("DFS traversal (recursive) starting from vertex 0: ");
        graph.dfs(0);

        System.out.println();

        System.out.print("DFS traversal (iterative) starting from vertex 0: ");
        graph.dfsIterative(0);
    }
}
