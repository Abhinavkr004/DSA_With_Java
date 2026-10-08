import java.util.Arrays;
import java.util.HashSet;

public class Check_if_N_and_its_double_exist_Leetcode_1346 {
	// Brute force
	// TC : O(n^2)
	// SC : O(1)
	public static boolean isExist(int[] arr) { 
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[j]*2==arr[i]) {
					return true;
				}
			}
		}
		return false;
	}
	
	// Better solution
	// Time Complexity : O(nlog n) + O(1)
	// Space Complexity : O(1)
	public static boolean isExist2(int[] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		for(int i = 0 ; i < n ; i++) {
			int target = 2*arr[i];
			int idx = Arrays.binarySearch(arr, target);
			if(idx >= 0 && idx != i) {
				return true;
			}
		}
		return false;
	}
	
	// Optimal solution
	public static boolean isExist3(int[] arr) {
		HashSet<Integer> hash = new HashSet<>();
		for(int x : arr) {
			if(hash.contains(2*x) || (x%2==0) && hash.contains(x/2)) {
				return true;
			}
			hash.add(x);
		}
		return false;
	}
	
	public static void main(String[] args) {
		int [] arr = {10,5,7,3};
		System.out.println(isExist(arr));
		System.out.println(isExist2(arr));
		System.out.println(isExist3(arr));
		
	}

}
