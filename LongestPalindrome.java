import java.util.*;

class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] a=new int[128];
        int r=0;
        boolean b=false;
        for(int i=0; i<s.length(); i++) {
            a[s.charAt(i)]++;
        }
        for(int i=0; i<a.length; i++) {
            r+=a[i]/2*2;
            if(a[i]%2 == 1) b=true;
        }
        return b ?r+1 :r;
    }
}
