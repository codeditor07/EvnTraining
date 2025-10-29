import java.util.*;
public class Simple_intrest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount (P):");
        int P = sc.nextInt();
        System.out.print("Enter the Intrest Rate (R):");
        int R = sc.nextInt();
        System.out.print("Enter the Time (T) :");
        int T = sc.nextInt();
        float SI = (P*R*T)/100;
        System.out.println("The Simple Intrest is:"+SI);
    }
}
