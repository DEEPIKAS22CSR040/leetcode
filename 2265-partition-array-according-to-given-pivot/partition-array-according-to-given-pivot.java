class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer>l1=new ArrayList<>();
        List<Integer>l2=new ArrayList<>();
        List<Integer>l3=new ArrayList<>();
        for(int i:nums)
        {
            if(i<pivot)
            l1.add(i);
            else if(i>pivot)
            l2.add(i);
            else
            l3.add(i);
        } 
        int res[]=new int[nums.length];
        int c=0;
        for(int i:l1)
        res[c++]=i;
        for(int i:l3)
        res[c++]=i;
        for(int i:l2)
        res[c++]=i;
        return res;               
    }
}