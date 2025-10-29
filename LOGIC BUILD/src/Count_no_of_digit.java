import java.util.*;
public class Count_no_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        int n = sc.nextInt();
        int count = 0;
        while(n>0)
        {
            count = count + 1;
            n = n/10;
        }
        System.out.println( "Number of digit:"+count);
    }
}
