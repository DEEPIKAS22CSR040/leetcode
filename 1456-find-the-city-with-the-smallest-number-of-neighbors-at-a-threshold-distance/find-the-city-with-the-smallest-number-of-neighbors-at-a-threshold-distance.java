class Solution {
    public int findTheCity(int n, int[][] edges, int thresh) {
        int d[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                d[i][j]=(int)1e9;
                if(i==j)
                d[i][j]=0;
            }
        }
        for(int i=0;i<edges.length;i++)
        {
        d[edges[i][0]][edges[i][1]]=edges[i][2];
        d[edges[i][1]][edges[i][0]]=edges[i][2];
        }
        for(int k = 0; k < n; k++) {
        for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            if(d[i][j] > d[i][k] + d[k][j]) {
                d[i][j] = d[i][k] + d[k][j];
            }
        }
        }
        }
        int index=0,max=Integer.MAX_VALUE,c=0;
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(d[i][j]>0 && d[i][j]<=thresh)
                c++;
            }
            if(c<max || (c==max && i>index) )
            {
                max=c;
                index=i;
            }
           
           
        }
        return index;
    }
}

  