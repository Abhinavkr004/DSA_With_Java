import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Find_K_Closest_Elements_Leetcode_658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        while(left<=right){
            mid = left+(right-left)/2;
            if(arr[mid] == x){
                break;
            }
            else if(arr[mid] > x){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        if(arr[mid] < x){
            left = mid;
            right = mid+1;
        }
        else{
            left = mid-1;
            right = mid;
        }
        List<Integer> ans = new ArrayList<>();
        while(left >= 0 && right < arr.length && k > 0){
            if(Math.abs(arr[left]-x) <= Math.abs(arr[right]-x)){
                ans.add(arr[left]);
                left--;
            }
            else{
                ans.add(arr[right]);
                right++;
            }
            k--;
        }
        while(k>0 && left >= 0){
            ans.add(arr[left]);
            left--;
            k--;
        }
        while(k>0 && right < arr.length){
            ans.add(arr[right]);
            right++;
            k--;
        }
        Collections.sort(ans);
        return ans;
    }    
}

// TC : O(log n)
// SC : O(1)
