import java.util.*;

class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            String odd = expandFromCenter(s, i, i);
            String even = expandFromCenter(s, i, i + 1);
            String longer = odd.length() > even.length() ? odd : even;
            if (longer.length() > longest.length()) {
                longest = longer;
            }
        }
        return longest;
    }

    private String expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
