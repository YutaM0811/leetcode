import java.util.*;

class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] a=new int[nums.length];
        int[] r=new int[2];
        for(int i=0; i<nums.length; i++) {
            a[nums[i]-1]++;
        }
        for(int i=0; i<a.length; i++) {
            if(a[i]>1) r[0]=i+1;
            if(a[i]==0) r[1]=i+1;
        }
        return r;
    }
}
