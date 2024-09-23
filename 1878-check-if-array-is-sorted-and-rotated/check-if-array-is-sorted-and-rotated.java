class Solution {
    public boolean check(int[] nums) {
        int a[]=new int[nums.length];
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            a[j]=nums[(j+i)%n];
            if(check1(a))
            return true;            
        }
        return false;        
    }
    public boolean check1(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            return false;
        }
        return true;
    }
}