/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> l = new ArrayList<>(); // List to store preorder traversal

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        // Perform preorder traversal and store values in the list
        preorder(root);

        // Modify the tree in place using the preorder traversal result
        TreeNode current = root;
        for (int i = 1; i < l.size(); i++) { // Start from the second value in the list
            current.left = null; // Set the left child to null
            current.right = new TreeNode(l.get(i)); // Create a new node for the right child
            current = current.right; // Move to the next node
        }
    }

    // Preorder traversal helper function
    void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        l.add(root.val); // Add the current node value to the list
        preorder(root.left); // Traverse the left subtree
        preorder(root.right); // Traverse the right subtree
    }
}
