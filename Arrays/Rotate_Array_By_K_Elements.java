import java.util.Scanner;
public class Rotate_Array_By_K_Elements {
    public static int[] reverse(int[] nums, int l, int r){
        while(l<=r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        return nums;
    }
    public static int[] rotateKTimes(int[] nums,int k){
        k = k % nums.length;
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        reverse(nums, 0, nums.length-1);
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] res = rotateKTimes(arr,k);
        for(int i = 0 ; i < res.length ; i++){
            if(i == res.length-1){
                System.out.print(res[i]);
            }
            else{
                System.out.print(res[i] + ", ");
            }
        }
        sc.close();
    }
}

// for Left rotation : last me pura array reverse kro
// for Right rotation : Shuru me pura array reverse kro 