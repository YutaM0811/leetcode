import java.util.*;

class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, max = 0;
        for (int i=0; i<prices.length; i++) {
            int price = prices[i];
            if (price < min) min = price;
            int profit = price - min;
            if (profit > max) max = profit;
        }
        return max;
    }
}
