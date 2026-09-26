public class Majority_Element_Leetcode_169 {
    // Moore's Voting Algorithm
    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(count == 0){
                candidate = nums[i];
            }
            if(nums[i] == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int res = majorityElement(nums);
        System.out.println(res);
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)
