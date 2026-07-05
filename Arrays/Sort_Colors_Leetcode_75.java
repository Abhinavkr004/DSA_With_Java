import java.util.Arrays;

public class Sort_Colors_Leetcode_75 {

	public static void main(String[] args) {
		//Brute force approach
		int [] nums = {1,0,2,2,1,1,2,0,0,2,0,1};
		int count0 = 0, count1 = 0, count2 =0;
		for(int i = 0 ; i < nums.length ; i++) {
			if(nums[i] == 0) {
				count0++;
			}
			else if(nums[i] == 1) {
				count1++;
			}
			else {
				count2++;
			}
		}
		for(int i = 0 ; i < count0 ; i++) {
			nums[i] = 0;
		}
		for(int i = count0 ; i < count0 + count1 ; i++) {
			nums[i] = 1;
		}
		for(int i = count0+count1 ; i < nums.length ; i++) {
			nums[i] = 2;
		}
		System.out.println(Arrays.toString(nums));
		
		//Most Optimal solution
		int [] nums1 = {1,0,2,2,1,1,2,0,0,2,0,1};
		int n = nums1.length;
		int low = 0, mid = 0,high = n-1;
		while(mid<=high) {
			if(nums1[mid] == 0) {
				int temp = nums1[low];
				nums1[low] = nums1[mid];
				nums1[mid] = temp;
				low++;
				mid++;
			}
			else if(nums1[mid] == 1) {
				mid++;
			}
			else {
				int temp = nums1[mid];
				nums1[mid] = nums1[high];
				nums1[high] = temp;
				high--;
			}
		}
		System.out.println(Arrays.toString(nums1));
	}
}
