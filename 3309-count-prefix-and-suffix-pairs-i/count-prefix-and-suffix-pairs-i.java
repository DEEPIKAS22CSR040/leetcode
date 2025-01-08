class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int c=0;
        //Arrays.sort(words,Comparator.comparing(s->s.length()));
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                c+=isprefix(words[i],words[j]);
            }
        } 
        return c;       
    }
    static int isprefix(String a,String b)
    {
        int l=a.length();
        int l1=b.length();
             
        if(l<=l1 && a.equals(b.substring(0,l)) && a.equals(b.substring(l1-l,l1)))
        return 1;
        else
        return 0;
        
    }
}