import java.util.*;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++ ) {
            int n = nums[i];
            
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
            int m = nums[j];

            if (n + m == target) {
               return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
