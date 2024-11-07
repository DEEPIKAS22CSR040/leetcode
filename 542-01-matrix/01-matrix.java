class Node
{
    int row,col,steps;
    Node(int row,int col,int steps)
    {
        this.row=row;
        this.col=col;
        this.steps=steps;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int drow[]={0,1,0,-1};
        int dcol[]={1,0,-1,0};
        int m=mat.length;
        int n=mat[0].length;
        int dist[][]=new int[m][n];
        boolean vis[][]=new boolean[m][n];
        Queue<Node>q=new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==0)
                {
                    q.add(new Node(i,j,0));   
                    vis[i][j]=true;                                   
                }
            }
        }
        while(!q.isEmpty())
        {
            Node node=q.poll();
            int row=node.row;
            int col=node.col;
            int steps=node.steps;
            dist[row][col]=steps;
            for(int i=0;i<4;i++)
            {
                int nrow=row+drow[i];
                int ncol=col+dcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n &&vis[nrow][ncol]==false)
                {
                    vis[nrow][ncol]=true;
                    q.offer(new Node(nrow,ncol,steps+1));
                }
            }
        }
        return dist;
        
    }
}