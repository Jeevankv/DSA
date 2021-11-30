import java.util.*;

public class addToArrayForm {
    public static void main(String[] args) {
        int[] num = { 6 };
        System.out.println(addToArrayForm(num, 809));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();

        int n = num.length;
        int carry = 0;
        for (int i = n - 1; i >= 0; i--) {
            int digit = k % 10;
            k = k / 10;
            int x = num[i];
            int temp = (digit + x + carry) % 10;
            ans.add(temp);
            carry = (digit + x + carry) / 10;
        }
        if (k != 0 && carry != 0) {
            while (k > 0) {
                int dig = k % 10;
                int tmp = (dig + carry) % 10;
                carry = (dig + carry) / 10;
                ans.add(tmp);
                k = k / 10;
            }
        }
        if (carry != 0)
            ans.add(carry);

        Collections.reverse(ans);

        return ans;
    }
}
