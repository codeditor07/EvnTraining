import java.util.*;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length:");
        int l =sc.nextInt();
        System.out.print("Enter the breadth:");
        int b =sc.nextInt();
        int p =2*(l+b);
        System.out.print("The perimeter is:"+p);

    }
}
