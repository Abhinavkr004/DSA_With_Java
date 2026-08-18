package Recursion;
import java.util.List;
import java.util.ArrayList;

class Combination_Sum_Leetcode_39 {
    public static void combi(List<List<Integer>> res, List<Integer> curr, int[] nums, int tar, int idx){
        if(idx == nums.length){
            if(tar == 0){
                res.add(new ArrayList<>(curr));
        }
        return;
        }
        if(nums[idx] <= tar){
            curr.add(nums[idx]);
            combi(res,curr,nums,tar-nums[idx],idx);
            curr.remove(curr.size()-1);
        }
        combi(res,curr,nums,tar,idx+1);
    }
    public static List<List<Integer>> combinationSum(int[]nums, int target){
        List<List<Integer>> res = new ArrayList<>();
        combi(res,new ArrayList<>(),nums,target,0);
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,6,7};
        int target = 7;
        List<List<Integer>> res = combinationSum(nums,target);
        System.out.println(res);
    }
}