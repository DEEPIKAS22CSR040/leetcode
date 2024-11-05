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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        List<Integer>l=new ArrayList<>();
        int max=root.val;
        while(!q.isEmpty())
        {
            int n=q.size();
            int sum=0;
            for(int i=0;i<n;i++)
            {
                TreeNode temp=q.poll();
                sum+=temp.val;
                if(temp.left!=null)
                q.add(temp.left);
                if(temp.right!=null)
                q.add(temp.right);
            }
            max=Math.max(max,sum);
            l.add(sum);
        }
        return l.indexOf(max)+1;
        
    }
}