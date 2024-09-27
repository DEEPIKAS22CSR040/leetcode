class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        String str[]=s.split(" ");
        if(pattern.length() != str.length)
        return false;
        for(int i=0;i<pattern.length();i++)
        {
            char ch=pattern.charAt(i);
            if(!(map.containsKey(ch)) && !(map.containsValue(str[i])))
            map.put(ch,str[i]);
            else if(map.containsKey(ch))
            {
                if(!(map.get(ch).equals(str[i])))
                return false;
            }
            else if(map.containsValue(str[i]))
            {
                if(!(map.containsKey(ch)))
                return false;
            }
        } 
        return true;           
    }
}