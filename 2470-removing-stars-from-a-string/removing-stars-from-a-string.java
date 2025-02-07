class Solution {
    public String removeStars(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(ch!='*')
            sb.append(ch);
            else
            {
               int l=sb.length()-1;
               sb.deleteCharAt(l);
            }
        
        }
        return sb.toString();

    }
}