package first_java_program;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        double indianrupee,dollarusd;
//        let's suppose 1dollar is 83.24 rupees
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rupees :");
        indianrupee = sc.nextDouble();
        dollarusd = indianrupee*(1/83.24);
        System.out.println("Here's Your Dollar's Value : " + dollarusd);
    }
}
