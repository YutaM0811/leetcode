import java.util.*;

class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        int r = 0;
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))) r++;
        }
        return r;
    }
}
