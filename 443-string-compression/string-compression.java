class Solution {
    public int compress(char[] chars) {
        if (chars.length==1)
        {
            return 1;
        }
        char ch=chars[0];
        int c=0,j=0,index=0,i=0;
        for(i=1;i<chars.length;i++) 
        {
            if(chars[i]==ch)
            continue;
            else
            {
                chars[j++]=ch;
                c=i-index;
                if(c>1)
                {
                    String str=Integer.toString(c);
                    for(char chr:str.toCharArray())
                    chars[j++]=chr;
                }
                ch=chars[i];
                index=i;
                               
            }
        }
        chars[j++]=ch;
        c=i-index;
        if(c>1)
        {
        String str=Integer.toString(c);
        for(char chr:str.toCharArray())
        chars[j++]=chr;
        }
                

        return j;      
    }
}