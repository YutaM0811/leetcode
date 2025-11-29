import java.util.*;

class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                c++;
                continue;
            }
            r = r < c ? c : r;
            c = 0;
        }
        return r < c ? c : r;
    }
}
