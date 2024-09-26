class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums)
        set.add(i);
        int l=0,len=1;
        for(int i:nums)
        {
            if(!(set.contains(i-1)))
            {
            len=1;
            while(set.contains(i+len))
            len++;
            }
            l=Math.max(len,l);
        }
        return l;    
    }
   
}