class Solution {
    public int removeDuplicates(int[] nums) {
        int c=0;
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        for(int i:nums)
        set.add(i);
        Arrays.fill(nums,0);
        for(int i:set)
        nums[c++]=i;
        return set.size();
    }
}