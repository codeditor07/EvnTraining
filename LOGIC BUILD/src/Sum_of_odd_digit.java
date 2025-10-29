import java.util.*;
public class Sum_of_odd_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt();
        int sum=0;
        while(n>0)
        {
            int d= n% 10;
            if(d%2!=0)
            {
                sum = sum+d;
            }
            n = n/10;
        }
        System.out.println("Sum is :"+sum);
    }
}
