class Solution {
    public static boolean per(int x)
    {
        int sq=(int)Math.sqrt(x);
        return sq*sq==x;
    } 
    public int numSquares(int n) {
         if(per(n))
         return 1;
         for(int i=1;i*i<=n;i++)
         {
            if(per(n-(i*i)))
            return 2;
         }
         while(n%4==0)
         n=n/4;
         if(n%8==7)
         return 4;
         return 3;
    }
}