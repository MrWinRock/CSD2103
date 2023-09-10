// class BTNode<T> {
//     private T data;
//     private BTNode<T> leftChild;
//     private BTNode<T> rightChild;
//     private BTNode<T> parent;

//     public BTNode(T data) {
//         this.data = data;
//         this.leftChild = null;
//         this.rightChild = null;
//         this.parent = null;
//     }
    
// }

// class BinaryTree<T> {
//     private BTNode<T> root;
//     BTNode node = new BTNode(root);

//     public int countNodesWithOneChild(BTNode<T> node) {
//         if (node == null) return 0;

//         int count = 0;
//         if ((node.leftChild == null && node.rightChild != null) ||
//             (node.leftChild != null && node.rightChild == null)) {
//                 count = 1;
//         }

//         return count + countNodesWithOneChild(node.leftChild) + countNodesWithOneChild(node.rightChild);
//     }

//     public int numberOfLeaves(BTNode<T> node) {
//         if (node == null) return 0;

//         if (node.leftChild == null && node.rightChild == null) return 1;

//         return numberOfLeaves(node.leftChilde) + numberOfLeaves(node.rightChild);
//     }
// }

// public class Main {
    
// }
