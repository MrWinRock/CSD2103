class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class TreeCom {
    public static TreeNode createTree1() {
        TreeNode t1 = new TreeNode(9);
        t1.left = new TreeNode(6);
        t1.right = new TreeNode(14);
        t1.left.left = new TreeNode(9);
        t1.left.right = new TreeNode(2);
        t1.right.left = new TreeNode(11);
        t1.right.right = new TreeNode(4);
        return t1;
    }

    public static TreeNode createTree2() {
        TreeNode t2 = new TreeNode(0);
        t2.left = new TreeNode(-3);
        t2.right = new TreeNode(8);
        t2.left.right = new TreeNode(8);
        t2.right.right = new TreeNode(5);
        t2.right.right.left = new TreeNode(6);
        t2.right.right.right = new TreeNode(1);
        return t2;
    }

    public static TreeNode combineTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }

        int data1 = (t1 != null) ? t1.data : 0;
        int data2 = (t2 != null) ? t2.data : 0;
        TreeNode combined = new TreeNode(data1 + data2);

        combined.left = combineTrees((t1 != null) ? t1.left : null, (t2 != null) ? t2.left : null);
        combined.right = combineTrees((t1 != null) ? t1.right : null, (t2 != null) ? t2.right : null);

        return combined;
    }

    public static void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        TreeNode t1 = createTree1();
        TreeNode t2 = createTree2();

        TreeNode combinedTree = combineTrees(t1, t2);

        inOrderTraversal(combinedTree);
    }
}
