public class IntegerNode {
    private int item;
    private IntegerNode next;

    public IntegerNode(int item) {
        this.item = item;
        this.next = null;
    }

    public IntegerNode(int item, IntegerNode next) {
        this.item = item;
        this.next = next;
    }

    public void setNext(IntegerNode nextNode) {
        next = nextNode;
    }

    public IntegerNode getNext() {
        return next;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public static void main(String[] args) {
        IntegerNode head;
        IntegerNode n1 = new IntegerNode(42);
        head = n1;
        
        IntegerNode n2 = new IntegerNode(-3);
        n1.setNext(n2);
        IntegerNode n3 = new IntegerNode(17);
        n2.setNext(n3);
        IntegerNode n4 = new IntegerNode(9);
        n3.setNext(n4);
        n4.setNext(null);
    }
}