class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l=new ArrayList<>();
        boolean b[]=new boolean[nums.length];
        for(int i=0;i<nums.length;i++)
        b[nums[i]-1]=true;
        for(int i=0;i<nums.length;i++)
        {
            if(!(b[i]))
            l.add(i+1);
        }
        return l;
        
    }
}