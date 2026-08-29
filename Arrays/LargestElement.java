public class LargestElement {
	public static void main(String[] args) {
		int[] arr = {4,3,5,6,40,8,4,345,67,7,3,2};
		int largest = arr[0];
		for(int i = 1 ; i < arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("Largest element of your array is: " + largest);
	}
}
// TC : O(n)
// SC : O(1)
