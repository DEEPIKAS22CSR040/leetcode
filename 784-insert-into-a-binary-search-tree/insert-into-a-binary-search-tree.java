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
    public TreeNode insertIntoBST(TreeNode temp, int val) {
        TreeNode root=temp;
        TreeNode newnode=new TreeNode(val);
        if(root==null)
        {
            root=newnode;
            return root;
        }
        while(true)
        {
            if(val<root.val)
            {
                if(root.left==null)
                {
                    root.left=newnode;
                    break;
                }
                else
                root=root.left;
            }
            if(val>root.val)
            {
                if(root.right==null)
                {
                    root.right=newnode;
                    break;
                }
                else
                root=root.right;
            }
        }
        return temp;
        
    }
}