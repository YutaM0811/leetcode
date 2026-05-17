import java.util.*;

class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        int o=0, e=1;
        while(o<nums.length && e<nums.length) {
            if(nums[o]%2==0) o+=2;
            else if(nums[e]%2!=0) e+=2;
            else {
                int i=nums[o], j=nums[e];
                nums[o]=j;
                nums[e]=i;
                o+=2;
                e+=2;
            }
        }
        return nums;
    }
}
