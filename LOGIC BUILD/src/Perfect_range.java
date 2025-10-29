import java.util.Scanner;

public class Perfect_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int upper = sc.nextInt();

        System.out.println("Perfect numbers between 1 and " + upper + " are:");

        for (int i = 1; i <= upper; i++) {
            int sum = 0;


            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }


            if (sum == i && i != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
