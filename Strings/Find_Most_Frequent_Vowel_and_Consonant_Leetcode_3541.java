package Strings;

import java.util.HashMap;

class Find_Most_Frequent_Vowel_and_Consonant_Leetcode_3541 {
    public static int maxFreqSum(String s) {
        HashMap<Character,Integer> vowelMap = new HashMap<>();
        HashMap<Character,Integer> consonentMap = new HashMap<>();
        int maxV = 0;
        int maxC = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                vowelMap.put(s.charAt(i),vowelMap.getOrDefault(s.charAt(i),0)+1);
                maxV = Math.max(maxV,vowelMap.get(s.charAt(i)));
            }
            else{
                consonentMap.put(s.charAt(i),consonentMap.getOrDefault(s.charAt(i),0)+1);
                maxC = Math.max(maxC,consonentMap.get(s.charAt(i)));
            }
        }
        return maxV+maxC;
    }
    public static void main(String[] args) {
        String s = "successes";
        int res = maxFreqSum(s);
        System.out.println(res);
    }
}