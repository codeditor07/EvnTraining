import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int n=sc.nextInt();
        int digit =0;
        int t=n;
        int sum=0;
        while(t!=0)
        {
            t=t/10;
            digit++;
        }
        System.out.println("No of digit:"+digit);
        t=n;
        //No. of digit
        while(t!=0)
        {
            int r=t%10;
            sum= sum +(int)Math.pow(r,digit);
            t=t/10;
        }
        if (sum==n)
        {
            System.out.println("The number is armstrong");
        }
        else
        {
            System.out.println("The number is not armstrong");
        }
    }
}
