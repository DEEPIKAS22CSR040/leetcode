class Solution {
    public boolean sum(int nums[],int k,int vd)
    {
        int i=0,j=k,n=nums.length;
        while(j<n)
        {
            if(Math.abs(nums[i]-nums[j])<=vd)
            return true;
            i++;
            j++;
        }
        return false;
    }
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if(valueDiff==0)
        {
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<nums.length;i++)
            {
                if(map.containsKey(nums[i]))
                {
                    if(Math.abs(map.get(nums[i])-i)<=indexDiff)
                    return true;
                }
                map.put(nums[i],i);
            }
            return false;
        }
        boolean s=false;
        for(int k=1;k<=indexDiff;k++)
        {
            s=sum(nums,k,valueDiff);
            if(s==true)
            return true;
        }
        return false;
    }
}