import java.util.*;
public class Vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter only a character:");
        char ch_in =sc.next().charAt(0);
        if (ch_in=='a' || ch_in=='e' || ch_in=='i' || ch_in=='o' || ch_in=='u' ){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }


    }
}
