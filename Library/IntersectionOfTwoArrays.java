import java.util.*;

class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> n1Set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            n1Set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (n1Set.contains(nums2[i])) result.add(nums2[i]);
        }

        int[] r = new int[result.size()];
        int i = 0;
        for (int num : result) {
            r[i++] = num;
        }
        return r;
    }
}
