import java.util.*;

class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length==0) return new ArrayList<>();
        List<String> list=new ArrayList<>();
        int s=nums[0],e=s;
        for(int i=1; i<nums.length; i++) {
            if(e==nums[i]-1) {
                e=nums[i];
            } else {
                String str=s==e ?Integer.valueOf(s).toString() :s+"->"+e;
                list.add(str);
                s=nums[i];
                e=s;
            }
        }
        String str=s==e ?Integer.valueOf(s).toString() :s+"->"+e;
        list.add(str);
        return list;
    }
}
