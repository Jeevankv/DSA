import java.util.Map;

class Solution {
    public static void main(String[] args) {
        System.out.println(maxPower("abbbbbcccccccdeb"));
    }

    public static int maxPower(String s) {

        int max = Integer.MIN_VALUE;
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            if (ch == s.charAt(i + 1)) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}