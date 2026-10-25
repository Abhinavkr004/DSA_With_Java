import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Rank_TransForm_Of_an_Array_Leetcode_1331 {
    public static int[] arrayRankTransform(int[] arr) {
        int[] nums = arr.clone();
        Arrays.sort(nums);
        Map<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        for(int i = 0 ; i < nums.length ; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],rank++);
            }
        }
        int[] ans = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            ans[i] = map.get(arr[i]);
        }
        
        return ans; 
    }
    public static void main(String[] args) {
        int[] nums = {40,20,30,10};
        int[]res = arrayRankTransform(nums);
        System.out.println(Arrays.toString(res));
    }   
}
// Time complexity :- O(nlogn) for sorting 
// space complexity :- O(n) for using HashMap
