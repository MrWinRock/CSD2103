import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Edge {
    int src, dest, weight;

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

class Graph {
    private int V;
    private List<List<Edge>> adj;

    public Graph(int V) {
        this.V = V;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest, int weight) {
        adj.get(src).add(new Edge(src, dest, weight));
        adj.get(dest).add(new Edge(dest, src, weight));
    }

    public void primMST() {
        boolean[] inMST = new boolean[V]; // สร้าง array เก็บ vertex ขนาด V เพื่อติดตามว่า vertex ไหนอยู่หรือไม่อยู่ใน mst
        int[] parent = new int[V]; // สร้าง array  ขนาด V เพื่อเก็บ parent ของ vertex ใน mst
        int[] key = new int[V]; // สร้าง array  ขนาด V เพื่อเก็บ key (edge ที่น้ำหนักน้อยสุด) ของแต่ละ vertex
        for (int i = 0; i < V; i++) { // i to V
            key[i] = Integer.MAX_VALUE; // ทำให้ทุก key มีค่าเป็น infinity เพื่อให้เห็นว่ายังไม่อยู่ใน mst
        }

        PriorityQueue<Edge> pq = new PriorityQueue<>(V, Comparator.comparingInt(e -> e.weight)); // priority queue เก็บ edge | edge ที่น้ำหนักน้อยที่สุดจะอยู่หน้าสุด
        key[0] = 0; // set ให้ vertex เริ่มต้นมีค่า key ที่ 0
        pq.offer(new Edge(-1, 0, 0)); // add dummy edge ที่น้ำหนัก 0 เพื่อเริ่ม mst

        while (!pq.isEmpty()) { 
            Edge edge = pq.poll(); // dequeue edge ที่น้ำหนักน้อยที่สุดออกจาก priority queue
            int u = edge.dest; // เอาจุดหมายของ vertex ออกจาก edge (vertex ถูก add ใน mst)

            if (inMST[u]) // ถ้า vertex มีใน mst อยู่แล้ว ให้ ข้ามไปที่ loop ต่อไปเลย
                continue; // **ไม่ต้องทำข้างล่าง

            inMST[u] = true; // mark ว่า vertex ปัจจุบัน เคยเข้ามาใน mst แล้ว
            System.out.println("Edge: " + edge.src + " - " + edge.dest + " Weight: " + edge.weight);

            for (Edge neighbor : adj.get(u)) { // iteration through the neighbors of the current vertex
                int v = neighbor.dest; // update the key and parent arrays
                int weight = neighbor.weight;
                if (!inMST[v] && weight < key[v]) { // ถ้า neighbor ยังไม่เคยเข้ามาใน mst และ น้ำหนักของ edge ที่ติดอยู่น้อยกว่าค่าของ key ปัจจุบัน
                    parent[v] = u; // update parent
                    key[v] = weight; // update key
                    pq.offer(new Edge(u, v, weight)); // add edge to priority queue
                }
            }
        }
    }
}

public class PrimsAlgorithm {
    public static void main(String[] args) {
        int V = 5; // Number of vertices
        Graph graph = new Graph(V);

        // Add edges
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 3, 1);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 3);
        graph.addEdge(2, 4, 1);
        graph.addEdge(3, 4, 2);

        System.out.println("Minimum Spanning Tree (Prim's Algorithm):");
        graph.primMST();
    }
}
