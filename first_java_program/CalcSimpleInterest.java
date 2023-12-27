package first_java_program;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class CalcSimpleInterest {
    public static void main(String[] args) {
        double principal;
        float time;
        float rate_of_interest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Principal Value");
        principal = sc.nextDouble();
        System.out.println("Enter The Rate Of Interest");
        rate_of_interest = sc.nextFloat();
        System.out.println("Enter The Time");
        time = sc.nextFloat();
        double SI;
        SI = (principal * rate_of_interest * time) / 100;
        System.out.println("The Simple Interest is " + SI);


    }
}
