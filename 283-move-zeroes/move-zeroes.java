class Solution {
    public void moveZeroes(int[] nums) {
        int c=0,x=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            c++;
            else
            nums[x++]=nums[i];
        } 
        while(c!=0)
        {
        nums[x++]=0; 
        c--;
        }      
    }
}