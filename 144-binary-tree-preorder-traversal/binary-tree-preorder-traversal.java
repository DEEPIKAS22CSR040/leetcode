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
    List<Integer>l=new ArrayList<>();
    List<Integer> preorder(TreeNode root)
    {
        if(root==null)
        return l;
        l.add(root.val);
        preorder(root.left);
        preorder(root.right);
        return l;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        return preorder(root);
        
    }
}