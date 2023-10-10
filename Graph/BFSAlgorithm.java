import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    public void bfs(int startVertex) {
        boolean[] visited = new boolean[V]; // สร้างตัวแปรให้ตัว vertex ที่ไปแล้วเป็น boolean ขนาด V 
                                            // (ทุก vertex จะเป็นfalse)

        Queue<Integer> queue = new ArrayDeque<>(); // สร้าง queue เก็บ vertex ที่ไปแล้ว
        visited[startVertex] = true; // mark vertex เริ่มต้นเป็น vertex ที่ไปแล้ว
        queue.offer(startVertex); // enqueue vertex ที่ไปแล้ว

        while (!queue.isEmpty()) {
            int vertex = queue.poll(); // dequeue vertex เพื่อเก็บค่าในตัวแปรที่บอกว่า vertex นี้กำลังใช้งานอยู่
            System.out.print(vertex + " "); // print ค่า vertex ปัจจุบัน 

            for (int neighbor : adj.get(vertex)) { // loop หาตัวที่อยู่ติดกัน
                if (!visited[neighbor]) { // check ว่า vertex ไหนที่ยังไม่ไป
                    visited[neighbor] = true; // ถ้าเจอ vertex ที่ยังไม่ไป จะ mark ให้เป็นที่ไปแล้ว
                    queue.offer(neighbor); // enqueue vertex ที่ถูก mark ไป
                }
            }
        }
    }
}

public class BFSAlgorithm {
    public static void main(String[] args) {
        int V = 5;
        Graph graph = new Graph(V);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.print("BFS traversal starting from vertex 0: ");
        graph.bfs(0);
    }
}
