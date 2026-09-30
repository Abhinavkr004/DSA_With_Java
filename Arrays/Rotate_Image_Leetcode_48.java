import java.util.Arrays;
class Rotate_Image_Leetcode_48 {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0 ; i < n-1 ; i++){
            for(int j = i+1 ; j < n ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0 ; i < n ; i++){
            int start = 0;
            int end = n-1;
            while(start <= end){
            int temp = matrix[i][start];
            matrix[i][start] = matrix[i][end];
            matrix[i][end] = temp;
            start++;
            end--;
            }
        }
        for(int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }
        
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        rotate(matrix);
    }
}
// Time Complexity : O(n^2)
// Space Complexity : O(1)
