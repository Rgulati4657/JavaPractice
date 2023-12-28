package first_java_program;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 0,b = 1,n,temp;
        System.out.println("Enter the nth term :");
        n = sc.nextInt();
        if(n==0){
            System.out.println("Answer of "+ n +"th term is : " + a );
        }else {
            for (int i = 2; i <= n; i++) {
                temp = b;
                b = b + a;
                a = temp;

            }
            System.out.println("Answer of " + n + "th term is : " + b);
        }
    }
}
