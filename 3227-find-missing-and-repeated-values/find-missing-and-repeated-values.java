class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        List<Integer>l=new ArrayList<>();
        long n=grid.length;
        n=n*n;
        int a=0,b=0;
        long s=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            if(l.contains(grid[i][j]))
            a=grid[i][j];
            else
            {
                s+=grid[i][j];
                l.add(grid[i][j]);
            }
        }
        long res=(n*(n+1))/2;
        b=(int)(res-s);
        int arr[]=new int[2];
        arr[0]=a;
        arr[1]=b;
        return arr;
        
        
    }
    

}