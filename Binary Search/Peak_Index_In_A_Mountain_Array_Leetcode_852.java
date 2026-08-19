class Peak_Index_In_A_Mountain_Array_Leetcode_852 {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 1;
        int right = arr.length-2;

        if(arr[0] > arr[1]) return 0;
        if(arr[arr.length-1] > arr[arr.length-2]) return arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return mid;
            }
            else if(arr[mid] < arr[mid-1]){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }    
}

// TC : O(log n)
// SC : O(1)