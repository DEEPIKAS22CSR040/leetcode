class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
       List<Integer> l=new ArrayList<>();
       for(int n:nums)
       l.add(n);
       if(!(l.contains(1)))
       return 1; 
       Collections.sort(l);
       for(i=0;i<l.size()-1;i++)
       {
        if(l.get(i)<0)
        continue;
        if(l.get(i+1)- l.get(i)>1)
        return l.get(i)+1;        
       } 
       return l.get(i)+1;     
    }
}