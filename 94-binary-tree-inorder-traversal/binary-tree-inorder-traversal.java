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
     List<Integer> inorder(TreeNode root)
     {
        if(root==null)
        return l;
        inorder(root.left);
        l.add(root.val);
        inorder(root.right);
        return l;
     }
    public List<Integer> inorderTraversal(TreeNode root) { 
        return inorder(root);     

        
    }
}