class Solution {
    public int minimumRefill(int[] plants, int ca, int cb) {
        int step=0,n=plants.length;
        int c1=ca,c2=cb;
        int i=0,j=n-1;
        while(i<j)
        {
            if(ca<plants[i])
            {
            step++;
            ca=c1;
            }
            ca=ca-plants[i];
            if(cb<plants[j])
            {
            step++;
            cb=c2;
            }
            cb=cb-plants[j];
            i++;
            j--;
        }
        if(n%2!=0)
        {
            if(ca<plants[n/2] && cb<plants[n/2])
            step++;
        } 
        
        return step;       
    }
}