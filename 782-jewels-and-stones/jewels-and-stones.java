class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char j[]=jewels.toCharArray();
        char s[]=stones.toCharArray();
        int c=0;
        for(int i=0;i<j.length;i++)
        {
            for(int k=0;k<s.length;k++)
            {
                if(j[i]==s[k])
                c++;
            }
        }
        return c;
        
    }
}