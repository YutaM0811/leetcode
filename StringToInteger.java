import java.util.*;

class StringToInteger {
    public int myAtoi(String s) {
        int i=0, n=s.length(), si=1, r=0;
        while(i<n&&s.charAt(i)==' ') i++;
        if(i<n&&(s.charAt(i)=='+'||s.charAt(i)=='-')) {
            if(s.charAt(i)=='-') si=-1;
            i++;
        }
        while(i<n&&Character.isDigit(s.charAt(i))) {
            int d=s.charAt(i)-'0';
            if(r>Integer.MAX_VALUE/10||
                    (r==Integer.MAX_VALUE/10&&d>7)) {
                return si==1 ?Integer.MAX_VALUE :Integer.MIN_VALUE;
            }
            r=r*10+d;
            i++;
        }
        return r*si;
    }
}
