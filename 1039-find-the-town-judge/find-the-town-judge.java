class Solution {
    public int findJudge(int n, int[][] trust) {
        int row=trust.length;
        int indegree[]=new int[n+1];
        int outdegree[]=new int[n+1];
        for(int i=0;i<row;i++)
        {
            int a=trust[i][0];
            int b=trust[i][1];
            outdegree[a]++;
            indegree[b]++;
        }
        for(int i=1;i<n+1;i++)
        {
            if(outdegree[i]==0 && indegree[i]==n-1)
            return i;
        }
        return -1;
       
    }
}