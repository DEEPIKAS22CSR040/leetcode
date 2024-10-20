class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> s=new Stack<>();
        for(char ch:expression.toCharArray())
        {
            if(ch==',' || ch=='(')
            continue;
            if(ch==')')
            {
                boolean t=false,f=false;
                while(s.peek()!='!' && s.peek()!='&' && s.peek()!='|')
                {
                    char chr=s.pop();
                    if(chr=='t')
                    t=true;
                    else if(chr=='f')
                    f=true;
                }
                char chr=s.pop();
                if(chr=='&')
                s.push(f?'f':'t');
                else if(chr=='|')
                s.push(t?'t':'f');
                else
                s.push(t?'f':'t');
            }
            else if(ch=='t' || ch=='f' || ch=='!' || ch=='&' || ch=='|')
            s.push(ch);
        }
        return s.peek()=='t';
        
    }
}