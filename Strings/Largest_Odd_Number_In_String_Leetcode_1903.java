package Strings;

public class Largest_Odd_Number_In_String_Leetcode_1903 {
    public static String largestOddNumber(String num) {
        for(int i = num.length()-1 ; i >= 0 ; i--){
            int digit = num.charAt(i)-'0';
            if(digit % 2 != 0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String num = "12347";
        String res = largestOddNumber(num);
        System.out.println(res);
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)    
