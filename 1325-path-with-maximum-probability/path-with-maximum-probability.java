class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        double dist[]=new double[n];
        for(int i=0;i<n;i++)
        dist[i]=0.0;
        dist[start_node]=1.0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<edges.length;j++)
            {
                int u=edges[j][0];
                int v=edges[j][1];
                if(dist[v]<dist[u]*succProb[j])
                dist[v]=dist[u]*succProb[j];
                if(dist[u]<dist[v]*succProb[j])
                dist[u]=dist[v]*succProb[j];
            }
        }
        return dist[end_node];

        
    }
}