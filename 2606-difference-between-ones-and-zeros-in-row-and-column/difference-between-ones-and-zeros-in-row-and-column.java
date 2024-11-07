class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int diff[][]=new int[r][c];
        int ones_row[]=new int[r];
        int ones_col[]=new int[c];
        int zeros_row[]=new int[r];
        int zeros_col[]=new int[c];
        for(int i=0;i<r;i++) 
        {
            int sum1=0,sum2=0;
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]==0)
                sum1++;
                else
                sum2++;
            }
            zeros_row[i]=sum1;
            ones_row[i]=sum2;
        }  
        for(int i=0;i<c;i++) 
        {
            int sum1=0,sum2=0;
            for(int j=0;j<r;j++)
            {
                if(grid[j][i]==0)
                sum1++;
                else
                sum2++;
            }
            zeros_col[i]=sum1;
            ones_col[i]=sum2;
        } 
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                diff[i][j]=ones_row[i]+ones_col[j]-zeros_row[i]-zeros_col[j];
            }
        }
        return diff;
    }
}