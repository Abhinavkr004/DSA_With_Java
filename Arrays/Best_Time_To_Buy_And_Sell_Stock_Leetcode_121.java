public class Best_Time_To_Buy_And_Sell_Stock_Leetcode_121 {
    public static int maxProfit(int[] prices) {
        int MaxProfit = 0;
        int bestBuy = prices[0];
        for(int i = 1 ; i < prices.length ; i++){
            int cost = prices[i] - bestBuy;
            MaxProfit = Math.max(MaxProfit, cost);
            bestBuy = Math.min(bestBuy, prices[i]);
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        int res = maxProfit(nums);
        System.out.println(res);
    }
}
// TC : O(n)
// SC : O(1)
