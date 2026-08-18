package Recursion;
import java.util.ArrayList;
class Find_SubSequence {
    public static void sub(int index, int[]nums, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> curr){
        if(index == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        // picking
        curr.add(nums[index]);
        sub(index+1,nums,res,curr);
        curr.remove(curr.size()-1);
        // not picking
        sub(index+1,nums,res,curr);
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int[] nums = {1,2,3};
        sub(0,nums,list,new ArrayList<>());
        System.out.println(list);
    }    
}
