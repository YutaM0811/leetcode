import java.util.*;

class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int pl = 0, max = 0;
        Set<Character> w = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            while (w.contains(s.charAt(i))) {
                w.remove(s.charAt(pl));
                pl++;
            }
            w.add(s.charAt(i));
            max = Math.max(max, i - pl + 1);
        }
        return max;
    }
}
