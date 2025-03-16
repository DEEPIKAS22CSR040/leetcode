class Solution {
    public int maxScore(int[] nums, int k) {
        int lsum=0,rsum=0,index=nums.length-1,max=0;
        for(int i=0;i<k;i++)
        lsum+=nums[i];
        max=lsum;
        for(int i=k-1;i>=0;i--)
        {
            lsum-=nums[i];
            rsum+=nums[index--];
            max=Math.max(max,lsum+rsum);
        } 
        return max;
    }
}