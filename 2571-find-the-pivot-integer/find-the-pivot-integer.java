class Solution {
    public int pivotInteger(int n) {
        int ts=0,ls=0;
        for(int i=1;i<=n;i++)
        ts+=i;
        for(int i=1;i<=n;i++)
        {
            int rs=ts-ls-i;
            if(ls==rs)
            return i;
            ls=ls+i;
        }
        return -1;
        
    }
}