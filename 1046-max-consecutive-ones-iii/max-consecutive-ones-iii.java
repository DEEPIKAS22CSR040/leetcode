class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0,n_zero=0,max=0;
        for(int end=0;end<nums.length;end++)
        {
            if(nums[end]==0)
            n_zero++;
            while(n_zero>k)
            {
                if(nums[start]==0)
                n_zero--;
                start++;
            }
            max=Math.max(max,end-start+1);
        }
        return max;
        
    }
}