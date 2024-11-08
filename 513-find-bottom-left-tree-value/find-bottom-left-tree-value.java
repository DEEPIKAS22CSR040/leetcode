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
    public int findBottomLeftValue(TreeNode root) {
      if(root==null)
      return 0;
      Queue<TreeNode> q=new LinkedList<>();
      List<List<Integer>> l=new ArrayList<>();
      q.add(root);
      while(!q.isEmpty())
      {
        int n=q.size();
        List<Integer> l2=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            TreeNode temp=q.poll();
            l2.add(temp.val);
            if(temp.left!=null)
            q.add(temp.left);
            if(temp.right!=null)
            q.add(temp.right);
        }
        l.add(l2);
      }  
      return l.get(l.size()-1).get(0);
    }
}