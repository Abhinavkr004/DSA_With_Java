package Strings;

import java.util.HashMap;

public class Jewels_And_Stones_Leetcode_771 {
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashMap<Character, Integer> mpp = new HashMap<>();
        for(int i = 0 ; i < stones.length() ; i++){
            mpp.put(stones.charAt(i), mpp.getOrDefault(stones.charAt(i),0)+1);
        }
        for(char c : jewels.toCharArray()){
            if(mpp.containsKey(c)){
                count+=mpp.get(c);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int res = numJewelsInStones(jewels, stones);
        System.out.println(res);
    }
}
