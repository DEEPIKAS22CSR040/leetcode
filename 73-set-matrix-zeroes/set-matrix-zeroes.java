class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length,c=matrix[0].length;
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==0)
                {
                    List<Integer> l1=new ArrayList<>();
                    l1.add(i);
                    l1.add(j);
                    l.add(l1);
                }
                
            }
        }
        for(int i=0;i<l.size();i++)
        {
            int r1=l.get(i).get(0);
            int c1=l.get(i).get(1);
            for(int j=0;j<c;j++)
            matrix[r1][j]=0;
            for(int j=0;j<r;j++)
            matrix[j][c1]=0;
        }
       
    }
}