import java.util.*;

class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0, j=0, c=0;
        while(i<g.length && j<s.length) {
            if(s[j]>=g[i]) { //このクッキーでこの子供を満足させる
                c++;
                j++;
                i++;
            } else { //クッキーが小さい。次のクッキーや
                j++;
            }
        }
        return c;
    }
}
