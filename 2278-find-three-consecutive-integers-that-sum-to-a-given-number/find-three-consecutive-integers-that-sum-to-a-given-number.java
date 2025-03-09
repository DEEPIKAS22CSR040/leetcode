class Solution {
    public long[] sumOfThree(long num) {
        long x=3;
        if(num%x==0)
        {
            long q=num/x;
            return new long[]{q-1,q,q+1};
        }
        else 
        return new long[0];
        
    }
}