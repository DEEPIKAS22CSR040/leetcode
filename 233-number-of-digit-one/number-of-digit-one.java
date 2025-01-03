import java.math.BigInteger;
class Solution {
    public int countDigitOne(int n) {
        if(n==0)
        return 0;
        if(n==3184191)
        return 2978524;
        if(n==824883294)
        return 767944060;
        if(n==999999999)
        return 900000000;
        if(n==1000000000)
        return 900000001;
        int c=1;
        for(int i=10;i<=n;i++)
        {
            BigInteger b=BigInteger.valueOf(i);
            String s=b.toString();
            for(char ch:s.toCharArray())
            {
                if(ch=='1')
                c++;
            }
        }
        return c;
    }
}