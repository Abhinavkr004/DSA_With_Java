import java.util.Arrays;
public class Plus_One_Leetcvode_66 {
    public static int[] plusOne(int[] nums){
        for(int i = nums.length-1 ; i >= 0 ;  i--){
            if(nums[i] == 9){
                nums[i] = 0;
            }
            else{
                nums[i]++;
                return nums;
            }
        }
        nums = new int[nums.length+1];
        nums[0] = 1;
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {9};
        int[] res = plusOne(nums);
        System.out.println(Arrays.toString(res));
    }
}
