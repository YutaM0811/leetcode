import java.util.*;

class SearchInsertPosition [
    public int serchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
]
