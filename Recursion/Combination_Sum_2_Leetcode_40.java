package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_2_Leetcode_40 {
    public static void combi(List<List<Integer>> res, List<Integer> curr, int[] nums, int idx, int tar){
        if(tar == 0){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i = idx; i < nums.length ; i++){
            // checking duplicates
            if(i > idx && nums[i] == nums[i-1]) continue;
            
            if(nums[i] > tar) break;
            curr.add(nums[i]);
            combi(res,curr,nums,i+1,tar-nums[i]);
            curr.remove(curr.size()-1);
        }    
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        combi(res,new ArrayList<Integer>(), candidates,0,target);
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> res = combinationSum2(nums,target);
        System.out.println(res);
    }
}
