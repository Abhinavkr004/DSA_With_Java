public class Sqrtx_Leetcode_69 {
    public int mySqrt(int x) {
        long left=0;
        long right=x;
        while(left<=right){
            long mid = left+(right-left)/2;
            long square=mid*mid;
            if(square==x){
                return (int)mid;
            }
            else if(square > x){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return (int)right;
    }
}

// Time Complexity : O(log n)
// Space Complexity : O(1)
