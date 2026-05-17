import java.util.*;

class RansamNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < magazine.length(); i++) {
            list.add(magazine.charAt(i));
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (!list.remove(Character.valueOf(ransomNote.charAt(i)))) return false;
        }
        return true;
    }

    // 別解　こちらのほうが断然早い
    public boolean canConstruct(String ransomNote, String magazine) {
        // a-zの数をカウントするための配列
        int[] count = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            int idx = ransomNote.charAt(i) - 'a';
            if (count[idx] == 0) return false; //足りない
            count[idx]--;
        }
        return true;
    }
    
}
