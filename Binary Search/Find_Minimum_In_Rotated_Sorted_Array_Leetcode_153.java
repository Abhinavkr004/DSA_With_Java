class Find_Minimum_In_Rotated_Sorted_Array_Leetcode_153 {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low+(high-low)/2;
            // if the array is sorted
            if(nums[low] <= nums[high]){
                ans = Math.min(ans,nums[low]);
                break;
            }
            // left half is sorted
            if(nums[low] <= nums[mid]){
                ans = Math.min(ans,nums[low]);
                low = mid+1;
            }
            // right half is sorted
            else{
                ans = Math.min(ans,nums[mid]);
                high = mid-1;
            }
            
        }
        return ans;
    }    
}
// TC : O(log n)
// SC : O(1)
