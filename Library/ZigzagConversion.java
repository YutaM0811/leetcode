import java.util.*;

class ZigzagConversion {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        String[] a=new String[numRows]; //StringBuildrの配列が一番高速
        for(int i=0; i<a.length; i++) {
            a[i]="";
        } 
        int l=0;
        int w=1;
        for(int i=0; i<s.length(); i++) {
            a[l]+=String.valueOf(s.charAt(i)); //<- ここが普通の配列だと遅い
            if(l==0) w=1;
            if(l==numRows-1) w=-1;
            l=l+w;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<a.length; i++) {
            sb.append(a[i]);
        }
        return sb.toString();
    }
}
