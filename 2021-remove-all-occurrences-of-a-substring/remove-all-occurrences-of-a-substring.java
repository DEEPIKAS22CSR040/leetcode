class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder(s);
        int len=part.length();
        while(sb.indexOf(part)!=-1)
        {
            int st=sb.indexOf(part);
            sb.delete(st,st+len);
        }
        return sb.toString();
        
    }
}