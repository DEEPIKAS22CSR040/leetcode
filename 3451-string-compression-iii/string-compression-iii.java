class Solution {
    public String compressedString(String word) {
        StringBuilder sb=new StringBuilder();
        char ch1=word.charAt(0);
        int c=1;
        for(int i=1;i<word.length();i++)
        {
            char ch2=word.charAt(i);
            if(ch1!=ch2)
            {
                if(c<=9)
                sb.append(String.valueOf(c)+ch1);
                else
                {
                    int q=c/9;
                    int r=c%9;
                for(int j=0;j<q;j++)
                sb.append("9"+ch1);
                if(r!=0)
                sb.append(String.valueOf(r)+ch1);
                }
                c=1;
                ch1=ch2;
            }
            else
            c++;
        }
        ch1=word.charAt(word.length()-1);
        if(c<=9)
                sb.append(String.valueOf(c)+ch1);
                else
                {
                    int q=c/9;
                    int r=c%9;
                for(int j=0;j<q;j++)
                sb.append("9"+ch1);
                if(r!=0)
                sb.append(String.valueOf(r)+ch1);
                }
        return sb.toString();
       
    }
}


