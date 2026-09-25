import java.util.HashMap;

public class Length_Of_Longest_SubArray_With_Atmost_K_Frequency_lLeetcode_2958 {
    // Pattern : SLIDING WINDOW WITH HASHMAP
    public static int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            while(k < map.get(nums[i]) && j < nums.length - 1) {
                    map.put(nums[j], map.get(nums[j])-1);
                    j++;
                    len = Math.max(len, i - j + 1);
                }
            len = Math.max(len, i - j + 1);
        }
        return len;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3,1,2};
        int k = 2;
        int res = maxSubarrayLength(nums,k);
        System.out.println(res);
    }
}
// Time Complexity : O(n)
// Space Complexity : O(n) because of using hashmap
