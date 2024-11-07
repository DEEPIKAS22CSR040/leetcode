class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int dist[]=new int[n+1];
        for(int i=1;i<=n;i++)
        dist[i]=(int)1e9;
        dist[k]=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<times.length;j++)
            {
                int u=times[j][0];
                int v=times[j][1];
                int wt=times[j][2];
                if(dist[u]+wt<dist[v])
                {
                    dist[v]=dist[u]+wt;
                }
            }
        } 
        
            int max=0;
            for(int x:dist) 
            {
                if(x==(int)1e9)
                return -1;
                max=Math.max(x,max);
            }
            return max;      
    }
}