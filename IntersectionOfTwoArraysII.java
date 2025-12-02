import java.uitl.*;

class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] max = nums1.length <= nums2.length ? nums1 : nums2;
        int[] min = nums1.length <= nums2.length ? nums2 : nums1;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < max.length; i++) {
            map.put(max[i], map.getOrDefault(max[i], 0) + 1);
        }

        for (int i = 0; i < min.length; i++) {
            if (map.containsKey(min[i]) && map.get(min[i]) > 0) {
                list.add(min[i]);
                map.put(min[i], map.get(min[i]) - 1);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
