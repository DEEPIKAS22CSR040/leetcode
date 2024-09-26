class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==1)
        return true;

     if(Character.isUpperCase(word.charAt(0)) && Character.isLowerCase(word.charAt(1)))
     {
        for(int i=2;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(ch>='A' && ch<='Z')
            return false;
        }
     }
     else if(Character.isUpperCase(word.charAt(0)))
     {
        
        for(int i=1;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(ch>='a' && ch<='z')
            return false;
        }
     } 
     else if(Character.isLowerCase(word.charAt(0)))
     {
        for(int i=1;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(ch>='A' && ch<='Z')
            return false;
        }
     } 
     return true;      
    }
}