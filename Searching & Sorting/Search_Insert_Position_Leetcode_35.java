class Search_Insert_Position_Leetcode_35 {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid]>=target){
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }    
}

// TC : O(log n)
// SC : O(1)
