import java.util.*;

class SortColors {
    public void sortColors(int[] nums) {
        int z=0,f=0,s=0,c=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==0) z++;
            if(nums[i]==1) f++;
            if(nums[i]==2) s++;
        }
        for(int i=0; i<z; i++) {
            nums[c]=0;
            c++;
        }
        for(int i=0; i<f; i++) {
            nums[c]=1;
            c++;
        }
        for(int i=0; i<s; i++) {
            nums[c]=2;
            c++;
        }
    }
}
