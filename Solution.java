class Solution {
    public static void main(String[] args) {
        String[] words = { "abc", "aabc", "bc" };
        System.out.println(makeEqual(words));
    }

    public static boolean makeEqual(String[] words) {
        int[] count = new int[26];
        int n = words.length;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                count[word.charAt(i) - 'a']++;
            }
        }

        for (int i : count) {
            if (i % n != 0)
                return false;
        }
        return true;
    }
}