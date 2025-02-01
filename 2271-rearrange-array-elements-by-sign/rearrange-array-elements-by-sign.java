class Solution {
    public int[] rearrangeArray(int[] nums) {
        int res[]=new int[nums.length];
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i:nums)
        {
            if(i>0)
            l1.add(i);
            else
            l2.add(i);
        }
        int c=0;
        for(int i=0;i<(nums.length/2);i++)
        {
            res[c++]=l1.get(i);
            res[c++]=l2.get(i);
        }
        return res;
        
    }
}