import java.util.*;

class ReverseInteger {
    public int reverse(int x) {
        int r=0;
        while(x!=0) {
            int d=x%10;
            x/=10;
            // 32bitオーバーフロー判定
            // 正の数(2147483647 の最後が7だから)
            if(r>Integer.MAX_VALUE/10 ||
                    (r==Integer.MAX_VALUE/10&&d>7)) return 0;
            // 負の数(-2147483648 の最後が8だから)
            if(r<Integer.MIN_VALUE/10 ||
                    (r==Integer.MIN_VALUE/10&&d<-8)) return 0;
            r=r*10+d;
        }
        return r;
    }
}
