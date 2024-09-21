class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i=1;i<=n;i++)
        l1.add(String.valueOf(i));
        Collections.sort(l1);
        for(String s:l1)
        {
            l2.add(Integer.valueOf(s));
        }
        return l2;
    }
}