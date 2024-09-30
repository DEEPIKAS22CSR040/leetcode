class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int i:nums)
        map.put(i,(map.getOrDefault(i,0))+1);
        int c=0;
        while(c<k)
        {
            int max=Collections.max(map.values());
            int remove=0;
            for(Map.Entry<Integer,Integer> entry:map.entrySet())
            {
                if(entry.getValue()==max)
                {
                    l.add(entry.getKey());
                    break;
                }
            }
            c++;
            map.remove(l.get(l.size()-1));
        
        }
        int a[]=new int[l.size()];
        int j=0;
        for(int i:l)
        a[j++]=i;
        return a;
        
    }
}