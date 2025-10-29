import java.util.*;
public class Star_pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the order of Matrix:");
        int matrix = sc.nextInt();
        for (int i=1; i<=matrix; i++)
        {
            for (int j= matrix; j>=i; j--)
            {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}