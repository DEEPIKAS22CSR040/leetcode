class Solution {
    public String toHex(int num) {
        if(num==0)
        return "0";
        char ch[]=new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        int c=0;
        StringBuilder sb=new StringBuilder();
        while(c<8 && num!=0)
        {
            sb.append(ch[num & 15]);
            num=num>>4;
            c++;
        }
        return sb.reverse().toString();        
    }
}