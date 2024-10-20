class Solution {
    public String[] findRelativeRanks(int[] score) {
        List<Integer> l=new ArrayList<>();
        for(int i:score)
        l.add(i);
        Collections.sort(l,Collections.reverseOrder());
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,String> map1=new HashMap<>();
        for(int i:score)
        {
            map.put(i,(l.indexOf(i))+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            switch(e.getValue())
            {
                case 1:
                map1.put(e.getKey(),"Gold Medal");
                break;
                case 2:
                map1.put(e.getKey(),"Silver Medal");
                break;
                case 3:
                map1.put(e.getKey(),"Bronze Medal");
                break;
                default:
                map1.put(e.getKey(),(String.valueOf(e.getValue())));

            }
        }
        String str[]=new String[map1.size()];
        for(int j=0;j<score.length;j++)
        str[j]=map1.get(score[j]);
        return str;

    
    }
}