class Solution {
    public int[] closestPrimes(int start, int end) {
        if(end<2)
        return new int[]{-1,-1};
        int num1=-1,num2=-1,min=Integer.MAX_VALUE;
        boolean isprime[]=new boolean[end+1];
        Arrays.fill(isprime,true);
        isprime[0]=false;
        isprime[1]=false;
        for(int i=2;i*i<=end;i++)
        {
            if(isprime[i])
            {
                for(int j=i*i;j<=end;j+=i)
                isprime[j]=false;
            }
        } 
        List<Integer>l=new ArrayList<>();
        for(int i=start;i<=end;i++)
        {
            if(isprime[i])
            {
                l.add(i);
            }
        } 
        for(int i=1;i<l.size();i++)
        {
            if(l.get(i)-l.get(i-1) < min)
            {
                min=l.get(i)-l.get(i-1);
                num1=l.get(i-1);
                num2=l.get(i);
            }
        } 
        return new int[]{num1,num2};   
    }
}