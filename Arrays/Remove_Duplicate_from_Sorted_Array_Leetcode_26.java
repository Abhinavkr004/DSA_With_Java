class Remove_Duplicate_from_Sorted_Array_Leetcode_26{
    public static int remove(int[] nums){
        int j = 0;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        int[]nums= {1,1,2};
        int res = remove(nums);
        System.out.println(res);
    }
}
// Time Complexity : O(n) Traversing only one time in Array
// Space Complexity : O(1) not using any extra space.
