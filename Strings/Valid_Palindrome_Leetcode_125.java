package Strings;

class Valid_Palindrome_Leetcode_125 {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            // now check for pallindrome
            if(left<right){
                if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        Boolean res = isPalindrome(s);
        System.out.println(res);
    }
}
// TC : O(n)
// SC : O(1)
