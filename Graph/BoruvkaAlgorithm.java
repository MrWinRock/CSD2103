import java.util.ArrayList;
import java.util.List;

class Edge {
    int src, dest, weight;

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

class Subset {
    int parent, rank;

    public Subset(int parent, int rank) {
        this.parent = parent;
        this.rank = rank;
    }
}

class Graph {
    private int V;
    private List<Edge> edges;

    public Graph(int V) {
        this.V = V;
        edges = new ArrayList<>();
    }

    public void addEdge(int src, int dest, int weight) {
        edges.add(new Edge(src, dest, weight));
    }

    public void boruvkaMST() {
        int[] parent = new int[V]; // สร้าง array เก็บ parent
        Subset[] subsets = new Subset[V]; // เก็บ subset
        int numTrees = V;

        for (int i = 0; i < V; i++) {
            parent[i] = i; //ให้ vertex เป็น parent ของตัวมันเอง
            subsets[i] = new Subset(i, 0); // ให้ subset เป็น rank 0 (ไม่ได้อยู่ติดกัับตัวอื่น)
        }

        while (numTrees > 1) { // loop จนกว่าจำนวน tree เหลือ 1
            int[] cheapest = new int[V]; // สร้าง array cheapest เพื่อเก็บ edge ที่น้อยที่สุดในแต่ละ subset

            for (int i = 0; i < V; i++)
                cheapest[i] = -1; // เริ่มที่ -1 (ยังไม่มี edge)

            for (Edge edge : edges) { // loop หาทุุกตัว
                int set1 = find(subsets, edge.src); // หาค่าของ subset
                int set2 = find(subsets, edge.dest); // หาจุดหมายของ subset

                if (set1 != set2) { // ถ้า endpoint ต่างกัน
                    if (cheapest[set1] == -1 || cheapest[set1] > edge.weight)
                        cheapest[set1] = edge.weight; // update cheeapest edge ของ subset

                    if (cheapest[set2] == -1 || cheapest[set2] > edge.weight)
                        cheapest[set2] = edge.weight; // update cheeapest edge ของ subset
                }
            }

            for (int i = 0; i < V; i++) {
                if (cheapest[i] != -1) { // ถ้ามี edge
                    int set1 = find(subsets, edges.get(i).src); // หาค่า edge ใน subset
                    int set2 = find(subsets, edges.get(i).dest); // หาจุุดหมายของ edge ใน subset

                    if (set1 != set2) {
                        System.out.println("Edge: " + edges.get(i).src + " - " + edges.get(i).dest + " Weight: "
                                + edges.get(i).weight);
                        union(subsets, set1, set2); // union
                        numTrees--;
                    }
                }
            }
        }
    }

    private int find(Subset[] subsets, int i) {
        if (subsets[i].parent != i)
            subsets[i].parent = find(subsets, subsets[i].parent);
        return subsets[i].parent;
    }

    private void union(Subset[] subsets, int x, int y) {
        int xRoot = find(subsets, x);
        int yRoot = find(subsets, y);

        if (subsets[xRoot].rank < subsets[yRoot].rank)
            subsets[xRoot].parent = yRoot;
        else if (subsets[xRoot].rank > subsets[yRoot].rank)
            subsets[yRoot].parent = xRoot;
        else {
            subsets[yRoot].parent = xRoot;
            subsets[xRoot].rank++;
        }
    }
}

public class BoruvkaAlgorithm {
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

        System.out.println("Minimum Spanning Tree (Borůvka's Algorithm):");
        graph.boruvkaMST();
    }
}
