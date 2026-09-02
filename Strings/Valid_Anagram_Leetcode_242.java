package Strings;

 class Valid_Anagram_Leetcode_242 {
    public static boolean isAnagram(String s, String t) {
        int s1 = s.length();
        int s2 = t.length();
        if(s1 != s2) {
        	return false;
        }
        int[] arr = new int[26];
        for(int i = 0 ; i < s1 ; i++) {
        	arr[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0 ; i < s2 ; i++) {
        	arr[t.charAt(i) - 'a']--;
        	if(arr[t.charAt(i) - 'a'] < 0) {
        		return false;
        	}
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean res = isAnagram(s,t);
        System.out.println(res);
    }
}

// TC : O(n)
// SC : O(1)
