class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> t=new TreeSet<>();
        for(int i=0;i<nums.length;i++)
        t.add(nums[i]);
        if(t.size()<3)
        return t.last();
        else
        {
            t.pollLast();
            t.pollLast();
            return t.last();
        }
        
    }
}