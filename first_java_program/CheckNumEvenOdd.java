package first_java_program;
// CHECK WHETHER THE NUMBER IS EVEN OR ODD USING USER INPUT;
import java.util.Scanner;

public class CheckNumEvenOdd {
    public static void main(String [] args){
        long num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextLong();
        if(num%2==0){
            System.out.println(num +" Entered numbered is Even");
        }
        else{
            System.out.println(num +" Entered numbered is ODD");

        }

    }
}
