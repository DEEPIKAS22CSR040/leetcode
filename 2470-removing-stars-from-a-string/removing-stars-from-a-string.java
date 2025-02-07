class Solution {
    public String removeStars(String s) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        for(char ch:s.toCharArray())
        {
            if(ch!='*')
            sb.append(ch);
            else
            {
               int l=sb.length()-1;
               sb.deleteCharAt(l);
            }
            i++;
        }
        return sb.toString();

    }
}