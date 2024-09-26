class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp=0,tp=0;
        if(s.length()==0)
        return true;
        if(t.length()==0)
        return false;
        while(tp<t.length())
        {
            if(s.charAt(sp)==t.charAt(tp))
            sp++;
            if(sp==s.length())
            return true;
            tp++;
        }
        return false;
        
    }
}