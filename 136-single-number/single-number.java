class Solution {
    public int singleNumber(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++)
      map.put(nums[i],(map.getOrDefault(nums[i],0))+1);
      int min=Collections.min(map.values());
      for(Map.Entry<Integer,Integer> entry:map.entrySet())
      {
        if(entry.getValue()==min)
        return entry.getKey();
      } 
      return 0;        
    }
}