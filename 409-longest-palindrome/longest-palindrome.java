class Solution {
    public int longestPalindrome(String s) {
    int c=0,odd=0;
    int ch[]=new int[58];
    for(char chr:s.toCharArray())
    ch[chr-'A']++;
    for(int i :ch )
    {
        if(i%2==0 && i!=0)
        c+=i;
        else if(i%2==1 && i!=1)
        {
        c+=i-1;
        odd=1;
        }
        else if(i==1)
        odd=1;
        
    }
    return c+odd;
        
    }
}