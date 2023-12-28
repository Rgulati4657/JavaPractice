package first_java_program;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String n,rev="" ;
        System.out.println("Enter The String");
        n = sc.nextLine().trim();
        n.toLowerCase();
       for(int i = n.length()-1;i>=0;i--){
           rev= rev+n.charAt(i);
        }
        if(n.equals(rev)){
            System.out.println("The entered String is Palindrome");

        }else{
            System.out.println("The entered String is not Palindrome");

        }

    }
}
