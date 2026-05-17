import java.util.*;

class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> r=new ArrayList<>();
        for(int[] c:intervals) {
            if(r.isEmpty()) {
                r.add(c);
                continue;
            }
            int[] p=r.get(r.size()-1);
            if(c[0]<=p[1]) {
                p[1]=Math.max(p[1],c[1]);
            } else {
                r.add(c);
            }
        }
        return r.toArray(new int[r.size()][]);
    }
}
