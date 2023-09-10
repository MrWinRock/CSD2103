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
        if (root == null) {
            return root;
        }

        if (value < root.data) {
            root.left = deleteNodeRec(root.left, value);
        } else if (value > root.data) {
            root.right = deleteNodeRec(root.right, value);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children, get the inorder successor
            root.data = minValue(root.right);

            // Delete the inorder successor
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

    public void postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }
}

public class BST {
    public static void main(String[] args) {
        int[] values = { 7, 8, 3, 5, 6, 4, 1, 2 };

        BinarySearchTree bst = new BinarySearchTree();

        for (int value : values) {
            bst.insert(value);
        }

        System.out.println("Inorder traversal of the BST:");
        bst.inorderTraversal(bst.root);

        System.out.println("\nPostorder traversal of the BST:");
        bst.postorderTraversal(bst.root);
    }
}
