package Strings;

class Length_Of_Last_Word_Leetcode_58 {
    public static int lengthOfLastWord(String s){
        s.trim();
        int count = 0;
        for(int i = s.length()-1 ; i >= 0 ; i--){
            if(s.charAt(i) == ' '){
                break;
            }
            else{
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "Hello world";
        int res = lengthOfLastWord(s);
        System.out.println(res);
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
