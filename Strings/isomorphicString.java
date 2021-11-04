package Strings;

import java.util.*;

class isomorphicString {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new LinkedList<>();
        for (String word : words) {
            boolean canAdd = isIsomorphic(word, pattern);
            if (canAdd)
                ans.add(word);

        }
        return ans;
    }

    public boolean isIsomorphic(String word, String pattern) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Boolean> map2 = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char ch1 = word.charAt(i);
            char ch2 = pattern.charAt(i);
            if (map1.containsKey(ch1)) {
                if (map1.get(ch1) != ch2)
                    return false;
            } else {
                if (map2.containsKey(ch2))
                    return false;
                else {
                    map1.put(ch1, ch2);
                    map2.put(ch2, true);
                }
            }
        }
        return true;
    }
}