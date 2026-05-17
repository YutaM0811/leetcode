import java.util.*;

class LongestUncommonSubsequenceI {
    public int findLUSlength(String a, String b) {
        if(Objects.equals(a,b)) return -1;
        return a.length()<b.length() ?b.length() :a.length();
    }
}
