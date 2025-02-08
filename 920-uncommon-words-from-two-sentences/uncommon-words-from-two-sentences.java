class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer>map=new HashMap<>();
        String str1[]=s1.split(" ");
        String str2[]=s2.split(" ");
        for(String s:str1)
        map.put(s,map.getOrDefault(s,0)+1); 
        for(String s:str2)
        map.put(s,map.getOrDefault(s,0)+1);
        List<String>l=new ArrayList<>();
        for(Map.Entry<String,Integer>e:map.entrySet())
        {
            if(e.getValue()==1)
            l.add(e.getKey());
        } 
        String s3[]=new String[l.size()];
        int c=0;
        for(String s:l)
        s3[c++]=s;     
        return s3;  
    }
}