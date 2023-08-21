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

    public Object getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    // before
    // public static void main(String[] args) {
    //     IntegerNode list;
    //     IntegerNode n1 = new IntegerNode(10);
    //     list = n1;

    //     IntegerNode n2 = new IntegerNode(20);
    //     n1.setNext(n2);
    // }

    // after
    public static void main(String[] args) {
        IntegerNode list;
        IntegerNode n1 = new IntegerNode(10);
        list = n1;

        IntegerNode n2 = new IntegerNode(20);
        n1.setNext(n2);

        IntegerNode n3 = new IntegerNode(30, n1);
        list = n3;
        n3.setNext(n1);
    }
}
