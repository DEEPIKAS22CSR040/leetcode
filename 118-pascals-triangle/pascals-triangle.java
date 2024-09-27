class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>l=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        l2.add(1);
        l.add(l2);
        if(numRows==1)
        return l;
        for(int i=1;i<numRows;i++)
        {
            int k=0;
            List<Integer> l1=new ArrayList<>();
            l1.add(1);
            for(int j=1;j<i;j++)
            {
                l1.add(l.get(i-1).get(k) + l.get(i-1).get(k+1));
                k++;
            }
            l1.add(1);
            l.add(l1);
        }
        return l;
        
    }
}