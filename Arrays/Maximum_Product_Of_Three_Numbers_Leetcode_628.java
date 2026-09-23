import java.util.Arrays;

public class Maximum_Product_Of_Three_Numbers_Leetcode_628 {

    public static int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max1 = nums[n-1]*nums[n-2]*nums[n-3];
        int max2 = nums[0]*nums[1]*nums[n-1];
        return Math.max(max1,max2);
    }
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3};
        int res = maximumProduct(nums);
        System.out.println(res);
    }
}

// Time Complexity : O(n logn) because using sorting
// Space Complexity : O(1)
