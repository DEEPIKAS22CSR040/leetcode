class Solution {
    public String decodeString(String s) {
        StringBuilder str=new StringBuilder();
        Stack<Integer>st=new Stack<>();
        Stack<StringBuilder>stacksb=new Stack<>();
        int n=0;
        for(char ch:s.toCharArray())
        {
            if(Character.isDigit(ch))
            n=(n*10)+ch-'0';
            else if(ch=='[')
            {
                st.push(n);
                n=0;
                stacksb.push(str);
                str=new StringBuilder();
            }
            else if(ch==']')
            {
                int k=st.pop();
                StringBuilder temp=str;
                str=stacksb.pop();
                while(k-- >0)
                {
                    str.append(temp);
                }
            }
            else
            str.append(ch);
        }
        return str.toString();
        
    }
}