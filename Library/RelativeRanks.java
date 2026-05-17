import java.util.*;

class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
        }
        list.sort(Comparator.reverseOrder());
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) map.put(list.get(i), "Gold Medal");
            else if (i == 1) map.put(list.get(i), "Silver Medal");
            else if (i == 2) map.put(list.get(i), "Bronze Medal");
            else map.put(list.get(i), String.valueOf(i + 1));
        }

        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            result[i] = map.get(score[i]);
        }
        return result;
    }
}
