import java.util.*;
public class Largestnum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>= b && a>=c)
        {
            System.out.println("The largest num is:"+a);
        }
        else if(b>=a && b>=c)
        {
            System.out.println("The largest num is:"+b);
        }
        else
        {
            System.out.println("The largest num is:"+c);
        }


    }
}
