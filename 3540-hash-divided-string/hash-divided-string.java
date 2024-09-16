class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i+=k)
        {
            String str=s.substring(i,i+k);
            int j=0;
            int sum=0;
            while(j<str.length())
            {
                char ch=str.charAt(j);
                int x=Math.abs((int)('a'-ch));
                sum+=x;
                j++;
            }
            int y=sum%26;
            sb.append((char)(y+'a'));
        }
        return sb.toString();
        
    }
}