class Remove_Element_Leetcode_27 {
    public static int removeElement(int[]nums, int val){
        int idx = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != val){ // always whi condition likhna hai jisko hme array ke shuru me rakhna hai(jo hme array me chaiye)
                nums[idx] = val;
                idx++;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int res = removeElement(nums,val);
        System.out.println(res);
    }    
}

// Time Complexity : O(n)
// Space Complexity : O(1)
