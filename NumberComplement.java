import java.util.*;

class NumberComplement {
    public int findComplement(int num) {
        int mask = 0;
        int tmp = num;

        // num と同じビット長の mask を作る (例: num=5→101, mask=111)
        while(tmp > 0) {
            mask = (mask << 1) | 1;
            tmp >>= 1;
        }
        // XOR でビット反転
        return num ^ mask;
    }
}
