public class SecondLargestElement {
	public static void main(String[] args) {
		// Brute force approach
//		int[] arr = {5,4,3,2,1,6};
//		int largest = arr[0];
//		for(int i = 0 ; i < arr.length; i++) {
//			if(arr[i] > largest) {
//				largest = arr[i];
//			}
//		}
//		System.out.println("Largest element is: " + largest);
//		int sLargest = -1;
//		for(int i = 0 ; i < arr.length ; i++) {
//			if(arr[i] > sLargest && arr[i] != largest) {
//				sLargest = arr[i];
//			}
//		}
//		System.out.println("Second Largest element is: " + sLargest);
		
		//Optimal approach
		int [] arr = {5,4,3,2,1,7,7,6,6};
		int largest = arr[0];
		int sLargest = Integer.MIN_VALUE;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > largest) {
				sLargest = largest;
				largest = arr[i];
			}
			else if(arr[i] > sLargest && arr[i] < largest) {
				sLargest = arr[i];
			}
		}
		if(sLargest == Integer.MIN_VALUE) {
			System.out.println(-1);
		}
		System.out.println("Second Largest element of your array is: " + sLargest);
		
		int [] arr2 = {5,4,3,2,1,7,7,6,6};
		int smallest = arr[0];
		int sSmallest = Integer.MIN_VALUE;
		for(int i = 0 ; i < arr2.length ; i++) {
			if(arr[i] < smallest) {
				sSmallest = smallest;
				smallest = arr[i];
			}
			else if(arr[i] < sSmallest && arr[i] > smallest) {
				sSmallest = arr[i];
			}
		}
		if(sSmallest == Integer.MAX_VALUE) {
			System.out.println(-1);
		}
		System.out.println("Second Smallest element of your array is: " + sSmallest);
	}
}

// TC : O(n)
// SC : O(1)
