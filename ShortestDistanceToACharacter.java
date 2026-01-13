import java.util.*;

class ShortestDistanceToACharacter {
    public int[] shortestToChar(String s, char c) {
        int[] a=new int[s.length()];
        int p=-s.length();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)==c) p=i;
            a[i]=i-p;
        }
        p=2*s.length();
        for(int i=s.length()-1; i>=0; i--) {
            if(s.charAt(i)==c) p=i;
            a[i]=Math.min(a[i],p-i);
        }
        return a;
    }
}
