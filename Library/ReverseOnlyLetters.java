import java.util.*;

class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] a=s.toCharArray();
        int l=0, r=s.length()-1;
        while(l<r) {
            char lc=a[l], rc=a[r];
            if(!Character.isLetter(lc)) l++;
            else if(!Character.isLetter(rc)) r--;
            else {
                a[r]=lc;
                a[l]=rc;
                l++;
                r--;
            }
        }
        return new String(a);
    }
}
