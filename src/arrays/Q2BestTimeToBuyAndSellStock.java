package arrays;

public class Q2BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};  // 5
        int[] prices1 = {7,6,4,3,1}; // 0

        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices1));
    }

    private static int maxProfit(int[] prices) {

        // maxProfit = MaxSellingPrice - LowestBuyingPrice (MaxValue - MinValue)

        int minValue = prices[0];
        int profit = 0;

        for(int i=1; i<prices.length;i++){
            if(prices[i] < minValue){
                minValue = prices[i];
            } else {
                profit = Math.max(profit,( prices[i]-minValue));
            }

        }

        return profit;

    }
}
