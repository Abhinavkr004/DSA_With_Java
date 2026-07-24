import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
public class Find_All_Repeating_Elements_In_An_Array {
    public static ArrayList<Integer> findDistinct(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                list.add(entry.getKey());
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> res = findDistinct(arr);
        System.out.println(res);
        sc.close();
    }
}
