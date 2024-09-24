class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length,i=0,j=0;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            if(nums[i]!=val)
            a[j++]=nums[i];
        }  
        for(i=0;i<j;i++)
        nums[i]=a[i];
        return j;         
        
        
    }
}