package first_java_program;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Calculator {
    static double calc(double first,char op,double second) {
    char con;
        Scanner sc = new Scanner(System.in);

        if (op == '+') {
            System.out.println("The Addition of " + first + " and " + second + " Number is : " + (first + second));
        } else if (op == '-') {
            System.out.println("The Subtraction of " + first + " And " + second + " Number is : " + (first - second));

        } else if (op == '*') {
            System.out.println("The Multiplication of " + first + " And " + second + " Number is : " + (first * second));

        } else if (op == '/') {
            if (second > 0) {
                System.out.println("The Division of " + first + " And " + second + " Number is : " + (first / second));
            } else {
                System.out.println("denominator should be greater than zero");
            }

        } else if (op == '%') {
            System.out.println("The (Remainder) modulus of " + first + " And " + second + " Number is : " + (first % second));

        } else {
            System.out.println("Enter Valid Operator: ('+' , '-' , '*' , '/' , '%' )");

        }


        System.out.println("Wanna exit Press :( X / x ) ");
        con = sc.next().trim().charAt(0);
        if (con == 'X' | con == 'x') {
           System.exit(0);
        }
        return 1;
    }
    public static void main(String[] args) {

        double first,second;
        char op;

        System.out.println("Press X or x to exit ");
        while (true){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter The First Number ");
            first = sc.nextDouble();
            System.out.println("Enter The Operator ");
            op = sc.next().trim().charAt(0);
            System.out.println("Enter The Second Number ");
            second = sc.nextDouble();
            calc(first , op , second);
            }
        }

}
