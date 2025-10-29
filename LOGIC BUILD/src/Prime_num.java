import java.util.*;
public class Prime_num {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the limit:");
    int n = sc.nextInt();
    int sum = 0;
    for (int i=2; i<=n; i++)
    {
     boolean flag = true;

     for (int j=2; j<=i/2; j++) {
         if ( i % j==0){
              flag = false;
              break;
         }
     }
     if (flag==true) {
         System.out.println(i+" ");
         sum=sum+i;
     }
    }

        sc.close();
        System.out.println(" "+sum);
    }
}
