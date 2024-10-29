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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        List<List<Integer>> l=new ArrayList<>();
        if(root==null)
        return l;
        while(!q.isEmpty())
        {
            List<Integer>l1=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode temp=q.poll();
                l1.add(temp.val);
                if(temp.left!=null)
                q.add(temp.left);
                if(temp.right!=null)
                q.add(temp.right);
            }
            l.add(l1);

        }
        Collections.reverse(l);
        return l;
        
    }
}