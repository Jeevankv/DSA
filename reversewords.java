import java.util.*;

class reversewords {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        // StringBuilder ans = new StringBuilder();
        String ans = "";
        for (String x : arr) {
            char[] rArr = x.toCharArray();
            int left = 0, right = rArr.length - 1;
            while (left <= right) {
                char temp = rArr[left];
                rArr[left] = rArr[right];
                rArr[right] = temp;
                left++;
                right--;
            }
            ans += ans.copyValueOf(rArr) + " ";

        }

        return ans.trim();
    }
}