import java.util.*;

class ClimbingStairs {
    public int climbStairs(int n) {
        if (n<=2) return n;

        int a=2, b=1, c=0;
        for (int i=3; i<n; i++) {
            c = a;
            a = a+b;
            b = c;
        }

        return a+b;
    }
}
