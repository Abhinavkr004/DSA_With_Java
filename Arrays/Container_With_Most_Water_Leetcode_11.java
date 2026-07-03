class Container_With_Most_Water_Leetcode_11{
    public static int maxArea(int[] height){
        int left = 0;
        int right = height.length-1;
        int area = 0;
        while(left<right){
            int width = right-left;
            int ht = Math.min(height[left],height[right]);
            area = Math.max(area,width*ht);
            if(height[left]<=height[right]){
                left++;
            } 
            else{
                right--;
            }
        }
        return area;
    }
    public static void main(String[] args) {
        int []nums = {1,8,6,2,5,4,8,3,7};
        int res = maxArea(nums);
        System.out.println(res);
    }
}