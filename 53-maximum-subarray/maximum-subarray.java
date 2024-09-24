class Solution {
    public int maxSubArray(int[] nums) {
        int max=0,maximum=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            max+=nums[i];
            if(max>maximum)
            maximum=max;
            if(max<0)
            max=0;
        }
        return maximum;
        
    }
}