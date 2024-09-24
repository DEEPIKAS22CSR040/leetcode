class Solution {
    public int countGoodSubstrings(String s) {
        int c=0,n=s.length();
        for(int i=0;i<n-2;i++)
        {
            String str=s.substring(i,i+3);
            if(str.charAt(0)!=str.charAt(1) && str.charAt(1)!=str.charAt(2) && str.charAt(0)!=str.charAt(2) )
            c++;
        }  
        return c;      
    }
}