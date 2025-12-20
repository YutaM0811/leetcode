import java.util.*;

class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        list.addAll(set);
        list.sort(Comparator.reverseOrder());
        if(list.size()<3) return list.get(0);
        return list.get(2);
    }
}
