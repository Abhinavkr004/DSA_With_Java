class Search_Insert_Position_Leetcode_35 {
    public static int searchInsert(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        int n = nums.length;
        int low = 0;
        int high = nums.length-1;
        int ans = n;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid]>=target){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]nums = {1,3,5,6};
        int target = 5;
        int res = searchInsert(nums,target);
        System.out.println(res);
    }
}
//Time complexity :- O(log n) because using binary Search
//Space complexity :- O(1) not using any extra Space here
