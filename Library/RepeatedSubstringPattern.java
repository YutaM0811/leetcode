import java.util.*;

class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        String ss=s+s;
        String str=ss.substring(1,ss.length()-1);
        return str.contains(s);
    }
}
