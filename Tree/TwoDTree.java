import java.util.Scanner;

class TreeNode {
    int x, y;
    TreeNode left, right;

    public TreeNode(int x, int y) {
        this.x = x;
        this.y = y;
        this.left = null;
        this.right = null;
    }
}

public class TwoDTree {
    private TreeNode root;

    public void insert(int x, int y) {
        root = insertRec(root, x, y, 0);
    }

    private TreeNode insertRec(TreeNode node, int x, int y, int depth) {
        if (node == null) {
            return new TreeNode(x, y);
        }

        int cd = depth % 2;

        if (cd == 0) {
            if (x < node.x) {
                node.left = insertRec(node.left, x, y, depth + 1);
            } else {
                node.right = insertRec(node.right, x, y, depth + 1);
            }
        } else {
            if (y < node.y) {
                node.left = insertRec(node.left, x, y, depth + 1);
            } else {
                node.right = insertRec(node.right, x, y, depth + 1);
            }
        }

        return node;
    }

    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.println("(" + node.x + ", " + node.y + ")");
            inorderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TwoDTree tree = new TwoDTree();

        System.out.print("Enter the height of the 2D tree: ");
        int height = scanner.nextInt();

        System.out.println("Enter the 2D coordinates (x y) for each node:");

        for (int i = 0; i < Math.pow(2, height) - 1; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            tree.insert(x, y);
        }

        System.out.println("Inorder traversal of the 2D tree:");
        tree.inorderTraversal(tree.root);

        scanner.close();
    }
}
