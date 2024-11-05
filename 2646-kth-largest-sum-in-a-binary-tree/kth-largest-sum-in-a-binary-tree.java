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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        List<Long>l=new ArrayList<>();
        while(!q.isEmpty())
        {
            long sum=0;
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode temp=q.poll();
                sum+=temp.val;
                if(temp.left!=null)
                q.add(temp.left);
                if(temp.right!=null)
                q.add(temp.right);
            }
            l.add(sum);
        }
        Collections.sort(l);
        int n=l.size();
        if(n<k)
        return -1;
        else
        return l.get(n-k);
        
    }
}