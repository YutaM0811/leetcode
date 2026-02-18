import java.util.*;

class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        // 3^19 = 1162261467
        // power of 3 that can fit in a 32-bit signed integer.
        return n>0&&1162261467%n==0;
    }
}
