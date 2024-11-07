class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int dist[]=new int[n];
        for(int i=0;i<n;i++)
        dist[i]=(int)1e9;
        dist[src]=0;
        for(int i=0;i<=k;i++)
        {
            int temp[]=Arrays.copyOf(dist,n);
            for(int j=0;j<flights.length;j++)
            {
                int u=flights[j][0];
                int v=flights[j][1];
                int wt=flights[j][2];
                if(dist[u]+wt<temp[v])
                temp[v]=dist[u]+wt;

            }
            dist=temp;
        }
        return dist[dst]==1e9?-1:dist[dst];
    }
}