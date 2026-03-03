import java.util.*;

class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n<=0) return true;
        for(int i=0; i<flowerbed.length; i++) {
            int l=i-1<0 ?0 :flowerbed[i-1];
            int r=i+1>flowerbed.length-1 ?0 :flowerbed[i+1];
            if(l==0 && r==0 && flowerbed[i]==0) {
                n--;
                flowerbed[i]=1;
            }
            if(n==0) return true;
        }
        return false;
    }
}
