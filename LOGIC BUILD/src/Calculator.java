import javax.swing.*;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        float num1= sc.nextFloat();
        System.out.print("Enter 2nd number :");
        float num2= sc.nextFloat();

        System.out.println("1.Addition:");
        System.out.println("2.Subtraction:");
        System.out.println("3.Multiplication:");
        System.out.println("4.Division:");
        System.out.println("Enter your choice:");
        int Check = sc.nextInt();


        switch (Check){
            case 1:
                System.out.println("Add:"+((int)num1+num2));
                break;
            case 2:
                System.out.println("Sub:"+((int)num1-num2));
                break;
            case 3:
                System.out.println("Mul:"+(num1*num2));
                break;
            case 4:
                if(num2!=0)
                   {
                       System.out.println("Div:"+(num1/num2));
                   }
                else
                    {
                        System.out.println("Division not possible by zero !");
                    }
                break;
            default:
                System.out.println("Invalid Choice !\t Enter a valid Choice.");
        }
    }
}
