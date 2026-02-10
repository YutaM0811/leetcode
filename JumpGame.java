import java.util.*;

class JumpGame {
    public boolean canJump(int[] nums) {
        int m=0;
        for(int i=0; i<nums.length; i++) {
            if(i>m) return false;
            m=m<i+nums[i] ?i+nums[i] :m;
            if(m>=nums.length-1) return true;
        }
        return true;
    }
}
