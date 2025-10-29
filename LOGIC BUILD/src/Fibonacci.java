import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your number:");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int temp=0;
        int sum=0;
        System.out.print(a+" "+b);
        while(a<=n)
        {
            temp=a+b;
            if (temp%2==0)
                sum= sum+temp;
            if(temp>n)
                break;
            a=b;
            b=temp;
            System.out.print(" "+temp);
        }
        System.out.println("\nThe sum of even fibonacci number:"+sum);
    }
}
