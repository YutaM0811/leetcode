import java.util.*;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> rl=new ArrayList<>();
        if(nums.length<3) return rl;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int l=i+1,r=nums.length-1;
            while(l<r) {
                int n=nums[i]+nums[l]+nums[r];
                if(n==0) {
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    rl.add(list);
                    while(l<r&&nums[l]==nums[l+1]) {
                        l++;
                    }
                    while(l<r&&nums[r]==nums[r-1]) {
                        r--;
                    }
                    l++;
                    r--;
                }
                else if(n<0) l++;
                else r--;
            }
        }
        return rl;
    }
}
