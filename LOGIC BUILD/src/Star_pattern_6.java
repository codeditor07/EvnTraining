import java.util.*;
public class Star_pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row:");
        int matrix = sc.nextInt();
        for (int i=1; i<=matrix; i++)
        {

            for (int j=matrix-1; j>=i; j--)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i=1; i<=matrix; i++)
        {
            for (int j=1; j<=i; j++)     //in place of "j=matrix-1" change  "j=1" || j++ || & "j>=i" change into "j<=i"
            {
                System.out.print(" ");
            }
            for (int k=matrix-1; k>=i; k--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
