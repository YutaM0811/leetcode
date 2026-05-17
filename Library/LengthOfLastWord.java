import java.util.*;

class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int n = 0;
        int i = s.length() -1;

        // 後ろのスペースを飛ばす
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // 単語の長さを数える
        while (i >= 0 && s.charAt(i) != ' ') {
            n++;
            i--;
        }

        return n;
    }
}
