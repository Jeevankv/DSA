import java.util.*;
class decimalToAnyBase {
    public static void main(String[] args) {
        System.out.println(sumBase(634, 8));
    }

    public static int sumBase(int n, int k) {
        int baseNum = 0;
        int i = 0;
        while (n != 0) {
            int dig = n % k;
            n = n / k;
            baseNum += dig * (int) Math.pow(10, i);
            i++;
        }
        int sum = 0;
        while (baseNum != 0) {
            int dig = baseNum % 10;
            sum += dig;
            baseNum /= 10;
        }
        return sum;
    }
}