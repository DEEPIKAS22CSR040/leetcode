class Solution {
    public int[] decrypt(int[] code, int k) {
        int a[]=new int[code.length];
        int n=code.length; 
        if(k==0)
        Arrays.fill(a,0);
        else if(k>0)
        {
            for(int i=0;i<n;i++)
            {
                int sum=0,j=i+1;
                int c=0;
                while(c<k)
                {
                    if(j<n)
                    sum+=code[j];
                    else
                    {
                        j=0;
                        sum+=code[j];
                    }
                    j++;
                    c++;
                } 
                a[i]=sum;                            
            }
        }
        else
        {
            k=-k;
            for(int i=0;i<n;i++)
            {
                int sum=0,j=i-1;
                int c=0;
                while(c<k)
                {
                    if(j<0)
                    {
                        j=n-1;
                    }                    
                   
                    sum+=code[j];
                    
                    j--;
                    c++;
                } 
                a[i]=sum;                            
            }
        } 
        return a;       
    }
}