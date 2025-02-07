class Solution {
    public int countMatches(List<List<String>> l, String rk, String rv) {
        int index=0,c=0;
        if(rk.equals("type"))
        index=0;
        else if(rk.equals("color"))
        index=1;
        else
        index=2;
        for(int i=0;i<l.size();i++)
        {
           if( l.get(i).get(index).equals(rv))
           c++;
        } 
        return c;       
    }
}