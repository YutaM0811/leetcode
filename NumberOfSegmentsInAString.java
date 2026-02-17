import java.util.*;

class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        int c=0;
        boolean b=false;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)!=' '&&!b) {
                c++;
                b=true;
            } 
            if(s.charAt(i)==' ') b=false;
        }
        return c;
    }
}
