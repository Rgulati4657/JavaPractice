package FunctionsPrac;


import java.util.Scanner;

public class FirstnNatural {
    public static void number(int num){
        for (int i =1;i<=num;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  Number to get natural numbers ");
        int num = sc.nextInt();
        number(num);

    }
}
