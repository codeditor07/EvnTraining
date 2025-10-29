import java.util.*;
public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first num :");
        int a = sc.nextInt();
        System.out.print("Enter the second num :");
        int b = sc.nextInt();
        int max;
        int Lcm;
        if(a>b) {
            max=a;
        }
        else {
            max=b;
        }
        while(true)
        {
            if (max % a == 0 && max % b == 0)
            {
                Lcm = max;
                break;
            }
            max++;
        }

        System.out.println(Lcm);

    }
}
