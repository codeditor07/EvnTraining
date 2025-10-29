import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it's automorphic: ");
        int number = sc.nextInt();

        //number of digit
        int t=0;
        int digit=0;
        while (t != 0) {
            t = t / 10;
            digit++;
        }
        int square = number * number;


        String numberStr = String.valueOf(number);
        String squareStr = String.valueOf(square);

        if (squareStr.endsWith(numberStr)) {
            System.out.println(number + " is an Automorphic Number.");
        } else {
            System.out.println(number + " is not an Automorphic Number.");
        }

        sc.close();
    }
}
