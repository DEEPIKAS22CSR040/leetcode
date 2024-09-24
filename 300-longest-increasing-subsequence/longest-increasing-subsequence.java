class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> r=new ArrayList<>();
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(r.size()==0 || nums[i] > r.get(r.size()-1))
            r.add(nums[i]);
            else
            {
                index=find(r,nums[i]);
                r.set(index,nums[i]);
            }
        }
        return r.size();
        
    }
    public int find(List<Integer> l,int x)
    {
        int left=0,right=l.size()-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(l.get(mid)==x)
            return mid;
            else if(l.get(mid) > x)
            right=mid-1;
            else
            left=mid+1;

        }
        return left;
    }
}