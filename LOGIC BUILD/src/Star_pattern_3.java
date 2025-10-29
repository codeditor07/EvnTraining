import java.util.*;
public class Star_pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the assending  matrix:");
        int order = sc.nextInt();

        for (int i=1; i<=order ;i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //Reverse
        for (int i=1; i<=order; i++)
        {
            for (int j= order-1; j>=i; j--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
