class Solution {
    public int maxVowels(String s, int k) {
        List<Character>l=new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        int max=Integer.MIN_VALUE,cv=0;
        /*for(int i=0;i<=s.length()-k;i++)
        {
           int c=0;
            for(int j=i;j<i+k;j++)
            {
                if(l.contains(s.charAt(j)))
                c++;                
            }
            max=Math.max(max,c);
        }  */
        for(int i=0;i<k;i++)
        {
            if(l.contains(s.charAt(i)))
            cv++;
        }
        max=Math.max(cv,max);
        for(int i=k;i<s.length();i++)
        {
            if(l.contains(s.charAt(i-k)))
            cv--;
            if(l.contains(s.charAt(i)))
            cv++;
            max=Math.max(max,cv);
        }
        return max;      
    }
}