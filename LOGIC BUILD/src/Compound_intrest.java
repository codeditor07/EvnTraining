import java.util.*;
public class Compound_intrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount (P):");
        int P = sc.nextInt();
        System.out.print("Enter the Intrest Rate (R):");
        int R = sc.nextInt();
        System.out.print("Enter the Time (T) :");
        int T = sc.nextInt();
        float CI = P*((1+R/100)^T)-P;
        System.out.println("The Compound Intrest is:"+CI);

    }
}
