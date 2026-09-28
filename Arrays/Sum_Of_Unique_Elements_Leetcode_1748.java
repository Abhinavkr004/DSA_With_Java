import java.util.HashMap;

public class Sum_Of_Unique_Elements_Leetcode_1748 {
    public static int sumOfUnique(int[] nums) {
        // int total = 0;
        // Arrays.sort(nums);
        // if(nums.length == 1){
        //     return nums[0];
        // }
        // for(int i = 0 ; i < nums.length ; i++){
        //     if(i == nums.length-1 && nums[i] != nums[i-1]){
        //         total+=nums[i];
        //     }
        //     else if(i != 0 && i != nums.length-1 &&(nums[i] != nums[i-1] && nums[i] != nums[i+1])){
        //         total+=nums[i];
        //     }
        //     else if(i == 0 && nums[i] != nums[i+1]){
        //         total+=nums[i];
        //     }
        // }
        // return total;

        HashMap<Integer,Integer> map = new HashMap<>();
        int total = 0;
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                total+=key;
            }
        }
        return total;
    }

    // Time Complexity : O(n)
    // Space Complexity : O(n)
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        int res = sumOfUnique(nums);
        System.out.println(res);
    }
}
