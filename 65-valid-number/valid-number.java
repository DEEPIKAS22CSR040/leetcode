import java.util.regex.*;
class Solution {
    public boolean isNumber(String s) {
        s=s.toLowerCase();
        Pattern p=Pattern.compile("[+-]?((\\d+)|((\\d+\\.)|(\\d+\\.\\d+)|(\\.\\d+)))(e[+-]?\\d+)?");
        Matcher m=p.matcher(s);
        boolean b=m.matches();
        return b;        
    }
}