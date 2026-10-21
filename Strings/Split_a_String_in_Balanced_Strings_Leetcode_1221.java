package Strings;

class Split_a_String_in_Balanced_Strings_Leetcode_1221 {
    public static int balancedStringSplit(String s) {
        int count = 0;
        int j = 0;
        int Rs = 0;
        int Ls = 0;
        char[] arr = s.toCharArray();
        for(int i = 0 ; i < arr.length ; i++){
            if(j < arr.length && arr[j] == 'R'){
                Rs++;
            }
            else{
                Ls++;
            }
            j++;
            if(Rs == Ls){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        int res = balancedStringSplit(s);
        System.out.println(res);
    }
}
// Time Complexity : o(n)
// Space Complexity : o(1)
