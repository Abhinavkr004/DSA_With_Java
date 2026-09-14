import java.util.Arrays;

class Sum_of_gcd_of_formed_pairs_Leetcode_3867 {
    public static int gcd(int a,int b){
        if(a == 0) return b;
        return gcd(b%a,a);
    }
    public static long gcdSum(int[] nums) {
        int[] prefixGcd = new int[nums.length];
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            max = Math.max(max,nums[i]);
            prefixGcd[i] = gcd(max,nums[i]);
        }
        Arrays.sort(prefixGcd);
        int l = 0;
        int r = prefixGcd.length-1;
        long sum = 0;
        while(l<r){
            sum+=(long)gcd(prefixGcd[l],prefixGcd[r]);
            l++;
            r--;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {3,6,2,8};
        long res = gcdSum(nums);
        System.out.println(res);
    }
}
// TC : O(n) + O(nlogn)
// SC : O(n) using a array size of input
