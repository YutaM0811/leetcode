import java.util.*;

class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] a=new int[heights.length];
        for(int i=0; i<heights.length; i++) {
            a[i]=heights[i];
        }
        Arrays.sort(heights);
        int c=0;
        for(int i=0; i<heights.length; i++) {
            if(a[i]!=heights[i]) c++;
        }
        return c;
    }
}
