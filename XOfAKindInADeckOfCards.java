import java.util.*;

class XOfAKindInADeckOfCards {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<deck.length; i++) {
            map.put(deck[i],map.getOrDefault(deck[i],0)+1);
        }
        int g=0;
        for(int c:map.values()) {
            g=gcd(g,c);
            if(g==1) return false;
        }
        return true;
    }

    private int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
