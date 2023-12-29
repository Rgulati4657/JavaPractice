package FunctionsPrac;

import java.util.Scanner;

public class PrinFactorial {
     public static int fact(int n){
         int facto = 1;
         for (int i = 1; i<= n;i++){
             facto*=i;
         }
         return facto;
     }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number");
        int n;
        n = sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }
}
