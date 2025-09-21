package arrays;

public class Q3BestTimeToBuyAndSellStockII {

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4}; //7
        int[] prices2 = {1, 2, 3, 4, 5}; //4

        System.out.println(bestTimeToBuyAndSellII(prices1));
        System.out.println(bestTimeToBuyAndSellII(prices2));
    }

    private static int bestTimeToBuyAndSellII(int[] prices) {

        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }

}
