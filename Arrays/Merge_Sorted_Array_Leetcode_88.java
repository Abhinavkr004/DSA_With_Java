import java.util.Arrays;
class Merge_Sorted_Array_Leetcode_88{
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = n + m - 1;

        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;   
            k--;
        }
        while(i >= 0){
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int n = 3;
        int m = 3;
        merge(nums1,m,nums2,n); 
    }
}

// Time Complexity : O(n) till completion of atleast one array and O(n) for remaining elements of second array = O(n)
// Space Complexity : O(1) No Usage of any Extra Space
