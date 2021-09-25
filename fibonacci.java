import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int first = 0, second = 1;
        int counter = 0;
        while (counter < n) {
            System.out.println(first + " ");
            int third = first + second;
            first = second;
            second = third;
            counter++;

        }
        scn.close();
    }

}
