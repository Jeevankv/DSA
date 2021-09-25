import java.util.*;

public class Gcd_Lcm {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int temp1 = num1;
        int temp2 = num2;
        while (temp1 % temp2 != 0) {
            int rem = temp1 % temp2;
            temp1 = temp2;
            temp2 = rem;

        }
        int gcd = temp2;

        int lcm = (num1 * num2) / gcd;
        System.out.println(gcd + "\n" + lcm);

    }
}