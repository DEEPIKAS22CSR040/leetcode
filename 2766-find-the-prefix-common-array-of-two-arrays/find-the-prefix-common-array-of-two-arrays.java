class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int c[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            int count=0;
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=0;j<=i;j++)
            {
                map.put(a[j],map.getOrDefault(a[j],0)+1);
                map.put(b[j],map.getOrDefault(b[j],0)+1);
            }
            for(Map.Entry<Integer,Integer> entry:map.entrySet())
            {
                if(entry.getValue()==2)
                count++;
            }
            c[i]=count;
        }
        return c;
        
    }
}