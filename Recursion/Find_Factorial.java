package Recursion;
class Find_Factorial {
    public static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        int res = fact(n);
        System.out.println(res);
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n) auxiliary space of recursion
