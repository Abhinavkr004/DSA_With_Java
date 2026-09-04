package Strings;

class Reverse_String_2_Leetcode_541 {
    public static void reverse(int start, int end, char[] str){
        while(start<=end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for(int i = 0 ; i < arr.length ; i += 2*k){
            int start = i;
            int end = Math.min(i+k-1,arr.length-1);
            reverse(start,end,arr);
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        String res = reverseStr(s,k);
        System.out.println(res);
    }
}
// TC : O(n)
// SC : O(1)
