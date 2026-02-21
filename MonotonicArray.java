import java.util.*;

class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        boolean i=false,d=false;
        for(int j=1; j<nums.length; j++) {
            if(nums[j-1]<nums[j]) i=true;
            if(nums[j-1]>nums[j]) d=true;
            if(i&&d) return false;
        }
        return true;
    }
}
