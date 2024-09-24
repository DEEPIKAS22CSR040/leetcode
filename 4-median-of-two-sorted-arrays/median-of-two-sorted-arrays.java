class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length,i=0;
        double z;
        int a[]=new int[n];
        for(i=0;i<nums1.length;i++)
        a[i]=nums1[i];
        for(int j=0;j<nums2.length;j++)
        a[i++]=nums2[j];
        Arrays.sort(a);
        int len=a.length;
        if(len%2 !=0)
        z=a[len/2];
        else
        z= (a[len/2]+a[(len/2)-1])/2.0;    
        return z;   
    }
}