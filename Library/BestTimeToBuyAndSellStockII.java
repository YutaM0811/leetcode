import java.util.*;

class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int mP=0;
        for(int i=1; i<prices.length; i++) {
            if(prices[i-1]<prices[i]) {
                mP+=prices[i]-prices[i-1];
            }
        }
        return mP;
    }
}
