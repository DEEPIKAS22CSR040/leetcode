class Solution {
    public int minSwapsCouples(int[] row) {
        int c=0,n=row.length;
        for(int i=0;i<n;i+=2)
        {
            int f=row[i];
            int s=(row[i]%2==0)?f+1:f-1;
            if(s!=row[i+1])
            {
                c++;
                for(int j=i+2;j<n;j++)
                {
                    if(row[j]==s)
                    {
                        int t=row[i+1];
                        row[i+1]=row[j];
                        row[j]=t;
                        break;
                    }
                }
            }
        }
        return c;
        
    }
}