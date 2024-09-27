class Solution {
    public List<Integer> getRow(int numRows) {
        List<List<Integer>>l=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        int i=0;
        l2.add(1);
        l.add(l2);
       // if(numRows==1)
        //return l2;
        for(i=1;i<=numRows+1;i++)
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
        i--;
        return l.get(numRows);
        
    }
}