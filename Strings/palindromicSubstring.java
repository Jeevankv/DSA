package Strings;

import java.util.Scanner;

public class palindromicSubstring {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substrg = s.substring(i, j);
                boolean flag = isPalindrome(substrg);
                if (flag) {
                    System.out.println(substrg);
                }
            }

        }
    }

    static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
