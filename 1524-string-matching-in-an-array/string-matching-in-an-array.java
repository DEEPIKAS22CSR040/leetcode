class Solution {
    public List<String> stringMatching(String[] words) {
        HashSet<String>l=new HashSet<>();
        //Arrays.sort(words,Comparator.comparing(s->(s.length())));
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                if(i==j)
                continue;
                if(words[j].contains(words[i]))
                l.add(words[i]);
            }
        }
        List<String>l1=new ArrayList<>(l);
        return l1;
        
    }
}