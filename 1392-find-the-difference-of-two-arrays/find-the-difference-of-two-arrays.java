class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer>s1=new HashSet<>();
        Set<Integer>s2=new HashSet<>();
        for(int i:nums1)
        s1.add(i);
        for(int i:nums2)
        s2.add(i);
        Set<Integer>s3=new HashSet<>(s1);
        s3.removeAll(s2);
        s2.removeAll(s1);
        List<List<Integer>>l=new ArrayList<>();
        
            List<Integer>l1=new ArrayList<>();
            for(int j:s3)
            l1.add(j);

            List<Integer>l2=new ArrayList<>();
            for(int j:s2)
            l2.add(j);
            l.add(l1);
            l.add(l2);
            return l;

        
        
    }
}