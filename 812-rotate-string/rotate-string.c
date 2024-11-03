bool rotateString(char* s, char* goal) {
    int i,j,flag=0;
    char temp;
    for(i=0;i<strlen(s);i++)
    {
        temp=s[0];
        for(j=0;j<strlen(s)-1;j++)
        s[j]=s[j+1];
        s[j]=temp;
        if(strcmp(s,goal)==0)
        {
            flag=1;
            break;
        }
    }
    if(flag==1)
    return 1;
    else
    return 0;
    
}