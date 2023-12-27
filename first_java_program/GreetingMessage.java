package first_java_program;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        String Name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        Name = sc.nextLine();
        System.out.println("!!!!!! ~~ HELLO ~~ !!!!!! My dear " + Name +" I hope You are good here....");

    }
}
