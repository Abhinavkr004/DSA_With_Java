class Find_Peak_Element_Leetcode_162 {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;
        int low = 1;
        int high = n-2;
        while(low<=high){
            int mid = low+(high-low)/2;
            // getting peak
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                return mid;
            }
            // below statement is stating mid is greater than mid-1
            else if(nums[mid] > nums[mid-1]){
                low = mid+1;
            }
            // below statement is stating mid is greater than mid+1
            else if(nums[mid] > nums[mid+1]){
                high = mid-1;
            }
            // below statement is for multiple peaks
            else{
                high = mid-1;
            }
        }
        return 0;
    }    
}

// Time Complexity : O(log n)
// Space Complexity : O(1)
