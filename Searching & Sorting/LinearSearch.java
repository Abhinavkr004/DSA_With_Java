class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 4;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                System.out.println("Element present at index: " + i);
                break;
            }
        }
    }  
}

// TC : O(n)
// SC : O(1)
