import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;

public class TwoSum {
	public static void main(String[] args) {
		//brute force solution
		
//		int [] nums = {1,2,3,1};
//		int n = nums.length;
//		int k = 2;
//		int[] arr = new int[2];
//		for(int i = 0 ; i < n ; i++) {
//			for(int j = i+1 ; j < n ; j++) {
//				if(nums[i] + nums[j] == k) {
//					arr[0] = i;
//					arr[1] = j;
//					break;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
// TC : O(n^2)
// SC : O(1)
		
		//Better solution
		
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(3);
		int n = nums.size();
		int target = 6;
		ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(0,0)); //initialize with two elements
		HashMap<Integer, Integer> hashmpp = new HashMap<>();
		for(int i = 0 ; i < n ; i++) {
			int a = nums.get(i);
			int more = target - a;
			if(hashmpp.containsKey(more)) {
				temp.set(0,hashmpp.get(more));
				temp.set(1,i);
			}
			hashmpp.put(nums.get(i), i);
		}
		System.out.println(temp);	
	}
}
// Time Complexity : O(n)
// Space Complexity : O(n) by using of hashMap
