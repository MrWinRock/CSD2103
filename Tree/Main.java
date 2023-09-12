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

class BinarySearchTree {
    TreeNode root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        if (value < root.data) {
            root.left = insertRec(root.left, value);
        } else if (value > root.data) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    public void deleteNode(int value) {
        root = deleteNodeRec(root, value);
    }

    private TreeNode deleteNodeRec(TreeNode root, int value) {
        if (root == null)
            return root;

        if (value < root.data) {
            root.left = deleteNodeRec(root.left, value);
        } else if (value > root.data) {
            root.right = deleteNodeRec(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);

            root.right = deleteNodeRec(root.right, root.data);
        }
        return root;
    }

    private int minValue(TreeNode root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] values = { 7, 8, 3, 5, 6, 4, 1, 2 };

        BinarySearchTree bst = new BinarySearchTree();

        for (int value : values) {
            bst.insert(value);
        }

        bst.inorderTraversal(bst.root);
    }
}
