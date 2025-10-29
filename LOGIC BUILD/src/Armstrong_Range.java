import java.util.*;
public class Armstrong_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = 0;
        int sum = 0;

        System.out.print("Enter the upper limit number: ");
        int limit = sc.nextInt();

        System.out.println("Armstrong numbers between 1 and " + limit + " are:");

        for (int n = 1; n <= limit; n++) {
            int t = n;

            // Count number of digits in current number n
            while (t != 0) {
                t = t / 10;
                digit++;
            }

            t = n;

            // Calculate sum of each digit raised to the power 'digit'
            while (t != 0) {
                int r = t % 10;
                sum += (int) Math.pow(r, digit);
                t = t / 10;
            }

            // Check if Armstrong
            if (sum == n) {
                System.out.println(n);
            }
        }
    }
}
