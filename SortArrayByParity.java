import java.util.*;

class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int[] a=new int[nums.length];
        int l=0, r=nums.length-1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]%2==0) {
                a[l]=nums[i];
                l++;
                continue;
            }
            a[r]=nums[i];
            r--;
        }
        return a;
    }
}
