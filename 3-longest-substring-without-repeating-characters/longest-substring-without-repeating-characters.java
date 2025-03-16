class Solution {
    public int lengthOfLongestSubstring(String s) {
        int hash[]=new int[256];
        Arrays.fill(hash,-1);
        int l=0,r=0,max=0;
        while(r<s.length())
        {
            char ch=s.charAt(r);
            if(hash[ch]!=-1)
            {
                if(hash[ch]>=l)
                l=hash[ch]+1;
            }
            max=Math.max(max,r-l+1);
            hash[ch]=r;
            r++;
        } 
        return max;       
    }
}