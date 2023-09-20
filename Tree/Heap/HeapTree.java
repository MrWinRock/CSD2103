import java.util.Scanner;

public class HeapTree {
    private int[] heap;
    private int size;
    private int maxSize;

    public HeapTree(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.heap = new int[maxSize];
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private void insert(int value) {
        if (size == maxSize) {
            System.out.println("Heap is full.");
            return;
        }

        heap[size] = value;
        int current = size;
        size++;

        while (current > 0 && heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    private void buildMaxHeap() {
        for (int i = (size / 2) - 1; i >= 0; i--) {
            heapify(i);
        }
    }

    private void heapify(int index) {
        int largest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }

        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != index) {
            swap(index, largest);
            heapify(largest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height of the heap: ");
        int height = input.nextInt();

        int maxSize = (int) Math.pow(2, height + 1) - 1;

        HeapTree heapTree = new HeapTree(maxSize);

        System.out.println("Enter the elements for the heap:");
        for (int i = 0; i < maxSize; i++) {
            int element = input.nextInt();
            heapTree.insert(element);
        }
        input.close();

        heapTree.buildMaxHeap();

        System.out.println("Max Heap:");
        heapTree.printHeap();
    }
}
