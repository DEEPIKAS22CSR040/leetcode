class Solution {
    public int longestContinuousSubstring(String s) {
        int max=1,start=0;
        for(int i=1;i<s.length();i++)  
        {
            if(s.charAt(i)!=s.charAt(i-1)+1)
            start=i;
            max=Math.max(max,i-start+1);
        } 
        return max;     
    }
}