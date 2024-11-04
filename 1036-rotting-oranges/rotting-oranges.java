class Pair
{
    int row,col,level;
    Pair(int row,int col,int level)
    {
        this.row=row;
        this.col=col;
        this.level=level;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair>q=new LinkedList<>();
        int m=grid.length;
        int n=grid[0].length;
        boolean v[][]=new boolean[m][n];
        int fresh=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new Pair(i,j,0));
                    v[i][j]=true;
                }
                if(grid[i][j]==1)
                fresh++;
            }
        }
        int drow[]={0,1,0,-1};
        int dcol[]={1,0,-1,0};
        int max_level=0;
        while(!q.isEmpty())
        {
            int r=q.peek().row;
            int c=q.peek().col;
            int curr_level=q.peek().level;
            q.poll(); 
            max_level=Math.max(curr_level,max_level);           
        for(int i=0;i<4;i++)
        {
            int nrow=r+drow[i];
            int ncol=c+dcol[i];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && v[nrow][ncol]==false && grid[nrow][ncol]==1)
            {
                q.offer(new Pair(nrow,ncol,curr_level+1));
                v[nrow][ncol]=true;
                fresh--;
            }
        }
        }
        if(fresh!=0)
        return -1;
        else
        return max_level;
    }
}