import java.util.*;

class NumberOfLinesToWriteString {
    public int[] numberOfLines(int[] widths, String s) {
        int c = 0;
        int l = 1;
        for (int i = 0; i < s.length(); i++) {
            if (c + widths[s.charAt(i) - 'a'] > 100) {
                l++;
                c = widths[s.charAt(i) - 'a'];
                continue;
            }
            c = c + widths[s.charAt(i) - 'a'];  
        }
        return new int[]{l, c};
    }
}
