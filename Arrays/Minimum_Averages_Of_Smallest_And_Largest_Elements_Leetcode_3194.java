import java.util.Arrays;
public class Minimum_Averages_Of_Smallest_And_Largest_Elements_Leetcode_3194 {
    public static double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length-1;
        double min = Double.MAX_VALUE;
        while(l<r){
            double temp = (nums[l]+nums[r])/2.0;
            min = Math.min(min,temp);
            l++;
            r--;
        }
        return min;
    }
    // Time Complexity : O(nlogn + n) explanation: O(nlogn) is for sorting and then we are using two pointers approach so O(n) for that as well. 
    // Space Complexity : O(1) explanation: we are not taking any extra space here that's why O(1) space complexity.
    public static void main(String[] args) {
        int[] nums = {7,8,3,4,15,13,4,1};
        double res = minimumAverage(nums);
        System.out.println(res);
    }
}
