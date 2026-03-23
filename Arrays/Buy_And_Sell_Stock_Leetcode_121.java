public class Buy_And_Sell_Stock_Leetcode_121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {7,1,5,6,3,4};
		int n = arr.length;
		int profit = 0 , mini = arr[0];
		for(int i = 0 ; i < n ; i++) {
			int cost = arr[i] - mini;
			profit = Math.max(profit, cost);
			mini = Math.min(mini, arr[i]);
		}
		System.out.println(profit);
	}
}