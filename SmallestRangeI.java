import java.util.*;

class SmallestRangeI {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0, r=0;
        l=nums[0];
        r=nums[nums.length-1];
        while(k>0) {
            l++;
            r--;
            if(l>r) return 0;
            k--;
        } 
        return r-l;
    }
}
