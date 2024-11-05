class Solution {
    List<List<Integer>> l=new ArrayList<>();
    int vis[];
    int c=0;
    public int findCircleNum(int[][] isConnected) {
        vis=new int[isConnected.length+1];
    for(int i=0;i<isConnected.length+1;i++)
        l.add(new ArrayList<>());
        for(int i=0;i<isConnected.length;i++)
        {
            for(int j=0;j<isConnected[0].length;j++)
            {
                if(isConnected[i][j]==1)                
                l.get(i+1).add(j+1);                  
                          
            }                      
            
        }
        for(int i=1;i<=isConnected.length;i++)
        {
            if(vis[i]==0)
            {
                c++;
                dfs(i);
            }
        }
        return c; 

    }
    public void dfs(int x)
    {
        for(int a:l.get(x))
        {
            if(vis[a]==0)
            {
                vis[a]=1;
               dfs(a);
            }
        }        
    }
}