public class Find_Greatest_Common_Divisor_Of_Array_Leetcode_1979 {
    public static int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a,a);
    } 
    public static int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        return gcd(max,min);
    }
    public static void main(String[] args) {
        int []nums = {2,5,6,9,10};
        int res = findGCD(nums);
        System.out.println(res);
    }
}
//TC : O(n+log(m))
//SC : O(log m) because of recursion
