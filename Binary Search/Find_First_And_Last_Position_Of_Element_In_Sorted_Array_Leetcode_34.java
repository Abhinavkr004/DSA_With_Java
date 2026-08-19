class Find_First_And_Last_Position_Of_Element_In_Sorted_Array_Leetcode_34 {
    public int lowerBound(int[] nums, int n, int target){
        int low = 0;
        int high = n-1;
        int first = -1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target){
                first = mid;
                high = mid-1;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return first;
    }
    public int upperBound(int[] nums, int n, int target){
        int low = 0;
        int high = n-1;
        int last = -1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target){
                last = mid;
                low = mid+1;
            }
            else if(nums[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int lb = lowerBound(nums, nums.length, target);
        int ub = upperBound(nums, nums.length, target);
        return new int[]{lb, ub};
    }    
}

// TC : O(log n)*2
// SC : O(2) for upperBound and lowerBound