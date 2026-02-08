import java.util.*;

class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int p=nums[0],c=nums[0];
        for(int i=1; i<nums.length; i++) {
            if(c<0) c=nums[i];
            else c+=nums[i];
            if(p<c) p=c;
        }
        return p;
    }
}
