class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      HashMap<Integer,Integer> map=new HashMap<>();
      List<Integer> l=new ArrayList<>();
      for(int x:nums1)
      map.put(x,(map.getOrDefault(x,0)+1));
      for(int x:nums2)
      {
        if(map.containsKey(x) && map.get(x)>0)
        {
            l.add(x);
            map.put(x,(map.get(x))-1);
        }
      }
      int a[]=new int[l.size()];
      for(int i=0;i<l.size();i++)
      a[i]=l.get(i);
      return a;
        
    }
}