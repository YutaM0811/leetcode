import java.util.*;

class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        int np=0,tp=0;
        while(np<name.length()&&tp<typed.length()) {
            if(name.charAt(np)==typed.charAt(tp)) {
                np++;
                tp++;
                continue;
            }
            if(np>0&&
                    name.charAt(np-1)==typed.charAt(tp)) {
                tp++;
                continue;
            }
            return false;
        }
        if(np<name.length()) return false;
        while(tp<typed.length()) {
            if(typed.charAt(tp)!=name.charAt(name.length()-1)) return false;
            tp++;
        }
        return true;
    }
}
