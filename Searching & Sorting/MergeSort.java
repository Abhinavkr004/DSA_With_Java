import java.util.Arrays;

// Used when there are large amount of elements present
class MergeSort {
    public static void Merge(int [] arr , int low, int mid, int high) {
		int n1 = mid - low + 1;
		int n2 = high - mid;
		int [] L = new int[n1];
		int [] R = new int[n2];
		for(int i = 0 ; i < n1 ; i++) {
			L[i] = arr[low + i];
		}
		for(int j = 0 ; j < n2 ; j++) {
			R[j] = arr[mid + 1 + j];
		}
		int i = 0 , j = 0;
		int k = low;
		while(i < n1 && j < n2) {
			if(L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while(i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
    public static void MergeSortArr(int[] arr, int low , int high) {
		if(low >= high) {
			return;
		}
		int mid = (low + high) /2;
		MergeSortArr(arr, low, mid);
		MergeSortArr(arr, mid+1, high);
		Merge(arr, low, mid, high);
	}
    public int[] sortArray(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        MergeSortArr(nums, low, high);
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,4,2,1,7,8,5,4,6,7};
        MergeSortArr(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }    
}
// TC : O(n logn)
// SC : O(n)