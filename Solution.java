class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] counter = new char[26];
        for (char ch : sentence.toCharArray()) {
            counter[ch - 'a']++;
        }
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == 0)
                return false;
        }
        return true;

    }
}