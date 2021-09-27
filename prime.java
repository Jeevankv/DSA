import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        if (n == 1)
            System.out.println("prime");

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                count++;

            }
        }
        if (count == 0)
            System.out.println("prime");
        else {
            System.out.println("not prime");

        }
    }
}
