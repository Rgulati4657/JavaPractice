package first_java_program;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int one, two;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        one = sc.nextInt();
        System.out.println("Enter the Second number");
        two = sc.nextInt();
        if(one<two){
            System.out.println("Second number is greater");
        } else if (one==two) {
            System.out.println("Both Are Equal");
        }else{
            System.out.println("first number is greater");
        }
    }
}
