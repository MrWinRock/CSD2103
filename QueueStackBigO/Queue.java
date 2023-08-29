public class Queue {

    int[] queue;
    int front, rear;
    int size;;

    Queue(int size) {
        front = -1;
        rear = -1;
        this.size = size;
        queue = new int[size];
    }

    boolean isEmpty() {
        if (front == -1 || front == rear + 1)
            return true;
        else
            return false;
    }

    boolean isFull() {
        if (front == 0 && rear == size - 1)
            return true;
        else
            return false;
    }

    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            queue[rear] = element;
            System.out.println("Inserted: " + element);
        }
    }

    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            element = queue[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Removed: " + element);
            return element;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enQueue(23);
        q.enQueue(41);

        q.deQueue();
        q.deQueue();
        q.deQueue();
    }
}