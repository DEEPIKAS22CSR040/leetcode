class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int k=0;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.add(nums[i])==true)
            l.add(nums[i]);            
        }
        for(int i=0;i<l.size();i++)
        nums[i]=l.get(i);
        return l.size();

        
    }
}