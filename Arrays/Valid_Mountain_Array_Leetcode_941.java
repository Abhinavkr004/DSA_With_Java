class Valid_Mountain_Array_Leetcode_941 {
    public static int largest(int[] nums) {
        int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
        }
        return largest;
    }

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] == largest(arr))
                return false;
            if (arr[arr.length - 1] == largest(arr))
                return false;
            if (i < arr.length - 1 && arr[i] < arr[i + 1]) {
                continue;
            } else if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                return false;
            } else {
                j = i + 1;
                while (j < arr.length - 1) {
                    if (arr[j] == arr[j + 1])
                        return false;
                    if (arr[j] < arr[j + 1]) {
                        return false;
                    }
                    j++;
                }
                break;
            }
        }
        return true;
    }
    // public static boolean validMountainArray(int[] arr) {
    //     int n=arr.length;
    //     int i=0;
    //     while(i<n-1 && arr[i]<arr[i+1]){
    //         i++;
    //     }
    //     if(i==0 || i==n-1){
    //         return false;
    //     }
    //     while(i<n-1 && arr[i]>arr[i+1]){
    //         i++;
    //     }
    //     return i==n-1;
    // }
    public static void main(String[] args) {
        int[] arr = {0,3,2,1};
        boolean res = validMountainArray(arr);
        System.out.println(res);
    }   
}