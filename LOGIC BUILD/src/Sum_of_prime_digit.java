import java.util.*;
public class Sum_of_prime_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int sum=0;
        while(n>0){
            int d =n%10;
            if ( d == 2 && d == 3 && d == 5 && d == 7)
            {
                sum = sum+d;
            }
            n = n/10;

        }
        System.out.println(sum);
    }
}
