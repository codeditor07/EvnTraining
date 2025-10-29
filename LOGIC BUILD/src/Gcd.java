import java.util.*;
public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter your second number:");
        int num2 = sc.nextInt();
        while (num2!=0)
        {
            int temp = num2;
            num2 = num1%num2;
            num1 = temp;
        }
        System.out.println(num1);


    }

}
