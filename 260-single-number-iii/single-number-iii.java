class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        map.put(nums[i],(map.getOrDefault(nums[i],0)+1));
        int a[]=new int[2];
        int i=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
            a[i++]=entry.getKey();
            if(i==2)
            break;
        }
        return a;
        
    }
}