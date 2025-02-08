class Solution {
    public int largestAltitude(int[] gain) {
      List<Integer>l=new ArrayList<>();
      l.add(0);
      for(int i:gain)
      {
        l.add(l.get(l.size()-1)+i);
      }
      return Collections.max(l);
    }
}