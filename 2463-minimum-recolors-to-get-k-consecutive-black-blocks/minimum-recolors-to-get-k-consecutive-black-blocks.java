class Solution {
    public int minimumRecolors(String blocks, int k) {
        int c=Integer.MAX_VALUE;
        for(int i=0;i<=blocks.length()-k;i++)
        {
            String str=blocks.substring(i,i+k);
            HashMap<Character,Integer>map=new HashMap<>();
            for(char ch:str.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(!map.containsKey('W'))
            return 0;
            else
            c=Math.min(map.get('W'),c);
        } 
        return c;       
    }
}