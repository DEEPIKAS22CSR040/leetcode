class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(Character.isLetterOrDigit(ch))
           sb.append(ch);
        }
        StringBuilder sb2=new StringBuilder(sb);
        sb.reverse();
        return sb2.toString().equals(sb.toString());
        
        
    }
}