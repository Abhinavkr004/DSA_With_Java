package Strings;

import java.util.ArrayList;
import java.util.List;

public class Find_Words_Containing_Character_Leetcode_2942 {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < words.length ; i++){
            if(words[i].indexOf(x) != -1){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String[]words = {"leet","code"};
        char s = 'e';
        List<Integer> res = findWordsContaining(words,s);
        System.out.println(res);
    }
}
// TC : O(n)
// SC : O(n) using ArrayList for storing the indices
