import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Edge {
    int src, dest, weight;

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

class Graph {
    int V;
    List<Edge> edges;

    public Graph(int V) {
        this.V = V;
        this.edges = new ArrayList<>();
    }

    public void addEdge(int src, int dest, int weight) {
        edges.add(new Edge(src, dest, weight));
    }

    public List<Edge> kruskalMST() {
        List<Edge> mst = new ArrayList<>(); // สร้าง minumum spanning tree
        Collections.sort(edges, Comparator.comparingInt(e -> e.weight)); // sort edge ของ graph ด้วย weight

        DisjointSet disjointSet = new DisjointSet(V); // สร้าง disjoint set เพื่อให้แต่ละ vertex เริ่มจากตัวมันเอง
        for (Edge edge : edges) {
            int srcParent = disjointSet.find(edge.src); // find method เพื่อหา parent ของค่าของ edge
            int destParent = disjointSet.find(edge.dest); // find method เพื่อหา parent ของจุดหมายของ edge

            if (srcParent != destParent) { // ถ้าค่าและจุดหมายไม่เท่ากัน หมายความว่าสามารถใช้ edge นี้ได้
                mst.add(edge); // เพื่ม edge ใน mst
                disjointSet.union(srcParent, destParent); // union
            }
        }

        return mst;
    }
}

class DisjointSet {
    int[] parent, rank;

    public DisjointSet(int n) {
        parent = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    public void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);

        if (xRoot == yRoot)
            return;

        if (rank[xRoot] < rank[yRoot])
            parent[xRoot] = yRoot;
        else if (rank[xRoot] > rank[yRoot])
            parent[yRoot] = xRoot;
        else {
            parent[yRoot] = xRoot;
            rank[xRoot]++;
        }
    }
}

public class KruskalAlgorithm {
    public static void main(String[] args) {
        int V = 4;
        Graph graph = new Graph(V);
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 6);
        graph.addEdge(0, 3, 5);
        graph.addEdge(1, 3, 15);
        graph.addEdge(2, 3, 4);

        List<Edge> mst = graph.kruskalMST();
        System.out.println("Minimum Spanning Tree (Kruskal's Algorithm):");
        for (Edge edge : mst) {
            System.out.println(edge.src + " - " + edge.dest + " : " + edge.weight);
        }
    }
}
