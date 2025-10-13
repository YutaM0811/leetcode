import java.util.*;

class SingleNumber {
    public int singleNumber(int[] nums) {
        int b = 0;
        for (int i = 0; i <= nums.length -1; i++) {
            b = b ^ nums[i];
        }
        return b;
    }
}
