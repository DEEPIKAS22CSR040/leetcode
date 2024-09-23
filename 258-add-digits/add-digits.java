class Solution {
    public int addDigits(int num) {
        while(num>9)
        {
            num=check(num);
        }
        return num;        
    }
    public  int check(int num)
    {
        int r=0;
        while(num!=0)
        {
            r=r+(num%10);
            num=num/10;
        }
        return r;
    } 
}