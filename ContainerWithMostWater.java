import java.util.*;

class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i=0, j=height.length-1, m=0;
        while(i<=j) {
            int iA=height[i];
            int jA=height[j];
            int l=iA<jA ?iA :jA;
            int a=l*(j-i);
            m=m<a ?a :m;
            if(iA<jA) i++;
            else j--;
        }
        return m;
    }
}
