import java.util.*;

class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]","");
        s = s.toLowerCase();
        int l = s.length() -1;

        for (int i = 0; i < l; i++) {
            int r = s.charAt(i) - s.charAt(l);
            if (r == 0) { 
                l--;
                continue;
            }
            return false;
        }
        return true;
    }
}
