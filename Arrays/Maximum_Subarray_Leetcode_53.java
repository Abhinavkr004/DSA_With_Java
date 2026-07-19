public class Maximum_Subarray_Leetcode_53 {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
            max = Math.max(max,sum);
            if(sum < 0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int res = maxSubArray(nums);
        System.out.println(res);
    }
}