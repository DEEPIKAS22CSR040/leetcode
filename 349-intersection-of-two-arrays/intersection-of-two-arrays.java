class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>s1=new HashSet<>();
        Set<Integer>s2=new HashSet<>();
        for(int i:nums1)
        s1.add(i);
        for(int i:nums2)
        s2.add(i);
        Set<Integer>s3=new HashSet<>(s1);
        s3.retainAll(s2);
        int a[]=new int[s3.size()];
        int c=0;
        for(int i:s3)
        a[c++]=i;
        return a;
        
    }
}